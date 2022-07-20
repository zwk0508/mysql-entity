package com.zwk.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

public class EntityGenerator {
    private CreateTable createTable;
    private String location;
    private String tablePrefix;
    private String packageName;
    private String mappingLocation;
    private Properties properties;


    public EntityGenerator(CreateTable createTable, ConfigOption configOption) {
        this.createTable = createTable;
        this.location = configOption.getLocation();
        this.tablePrefix = configOption.getTablePrefix();
        this.packageName = configOption.getPackageName();
        this.mappingLocation = configOption.getMappingLocation();
    }

    public void generate() throws IOException {
        CreateTable createTable = this.createTable;
        if (mappingLocation != null && mappingLocation.length() > 0) {
            File file = new File(mappingLocation);
            properties = new Properties();
            properties.load(new FileInputStream(file));
        }
        while (createTable != null) {
            String tableName = createTable.getTableName();
            if (tablePrefix != null) {
                if (tableName.startsWith(tablePrefix)) {
                    tableName = tableName.substring(tablePrefix.length());
                }
            }
            tableName = underScoreToCamelCase(tableName);
            List<ColumnDeclaration> columns = createTable.getColumns();
            generate(tableName, columns);
            createTable = createTable.getNext();
        }
    }

    private void generate(String tableName, List<ColumnDeclaration> columns) throws IOException {
        tableName = Character.toUpperCase(tableName.charAt(0)) + tableName.substring(1);
        File file = getFile(tableName);
        StringBuilder sb = getStringBuilder(tableName);
        StringBuilder fields = new StringBuilder();
        StringBuilder getterAndSetter = new StringBuilder();

        for (ColumnDeclaration column : columns) {
            String columnName = column.getColumnName();
            String dataType = column.getDataType();
            String comment = column.getComment();
            String javaType = getJavaType(dataType);
            columnName = underScoreToCamelCase(columnName);
            fields.append(toField(columnName, javaType, comment));
            getterAndSetter.append(toGetterAndSetter(columnName, javaType));
        }

        sb.append(fields).append(getterAndSetter).append("}");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(sb.toString().getBytes(StandardCharsets.UTF_8));
        }
    }

    private String toGetterAndSetter(String columnName, String javaType) {
        StringBuilder sb = new StringBuilder();
        String suffix = Character.toUpperCase(columnName.charAt(0)) + columnName.substring(1);
        sb.append(toGetter(columnName, suffix, javaType))
                .append(toSetter(columnName, suffix, javaType));

        return sb.toString();
    }

    private String toGetter(String columnName, String suffix, String javaType) {
        return "    public " + javaType + " get" + suffix + "() {\n"
                + "        return this." + columnName + ";\n    }\n\n";
    }

    private String toSetter(String columnName, String suffix, String javaType) {
        return "    public void" + " set" + suffix + "(" + javaType + " " + columnName + ") {\n"
                + "        this." + columnName + " = " + columnName + ";\n    }\n\n";
    }

    private String getJavaType(String dataType) {
        int index = dataType.indexOf("(");
        if (index > -1) {
            dataType = dataType.substring(0, index);
        }
        String javaType;
        if (properties != null) {
             javaType = (String) properties.get(dataType.toUpperCase(Locale.ROOT));
            if (javaType != null) {
                return javaType;
            }
        }
        Type type = Type.getType(dataType.toUpperCase(Locale.ROOT));
        if (type == null) {
            javaType = "String";
        } else {
            javaType = type.getJavaType();
        }
        return javaType;
    }

    private String toField(String columnName, String javaType, String comment) {
        StringBuilder sb = new StringBuilder();
        if (comment != null) {
            sb.append("    /**\n     * ")
                    .append(comment)
                    .append("\n     */\n");
        }
        sb.append("    private ")
                .append(javaType)
                .append(" ")
                .append(columnName)
                .append(";\n\n");
        return sb.toString();
    }


    private StringBuilder getStringBuilder(String tableName) {
        StringBuilder sb = new StringBuilder();
        if (packageName != null) {
            sb.append("package ").append(packageName).append(";\n\n");
        }
        sb.append("public class ").append(tableName).append(" {\n\n");
        return sb;
    }

    private File getFile(String tableName) {
        File file = null;
        if (location != null) {
            file = new File(location);
        }
        if (packageName != null) {
            if (file == null) {
                file = new File(packageName.replace('.', '/'));
            } else {
                file = new File(file, packageName.replace('.', '/'));
            }
        }
        String fileName = tableName + ".java";
        if (file != null) {
            if (!file.exists()) {
                file.mkdirs();
            }
            file = new File(file, fileName);
        } else {
            file = new File(fileName);
        }
        return file;
    }

    private String underScoreToCamelCase(String text) {
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c == '_') {
                if (i + 1 == length) {
                    sb.append(c);
                    break;
                } else {
                    c = text.charAt(i + 1);
                    if (c >= 'a' && c <= 'z') {
                        c -= 32;
                    }
                    sb.append(c);
                    i++;
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
