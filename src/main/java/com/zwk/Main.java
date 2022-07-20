package com.zwk;

import com.zwk.antlr.MySqlLexer;
import com.zwk.antlr.MySqlParser;
import com.zwk.parser.ConfigOption;
import com.zwk.parser.CreateTable;
import com.zwk.parser.CreateTableVisitor;
import com.zwk.parser.EntityGenerator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    /**
     * -l location 生成entity的位置
     * -tp tablePrefix 去除掉的表名前缀
     * -p  package 包
     * -m 类型映射文件地址，即sql type与java type的映射不指定则采用默认的映射
     * 最后跟上sql文件位置
     */
    public static void main(String[] args) throws Exception {
        if (args == null || args.length == 0) {
            return;
        }
        int length = args.length;
        int paramLen = length - 1;
        String filePath = args[paramLen];
        String location = null;
        String tablePrefix = null;
        String packageName = null;
        String mappingLocation = null;
        int i = 0;
        while (i < paramLen) {
            String arg = args[i];
            switch (arg) {
                case "-l":
                    if (i + 1 < paramLen) {
                        location = args[i + 1];
                    }
                    break;
                case "-tp":
                    if (i + 1 < paramLen) {
                        tablePrefix = args[i + 1];
                    }
                    break;
                case "-p":
                    if (i + 1 < paramLen) {
                        packageName = args[i + 1];
                    }
                    break;
                case "-m":
                    if (i + 1 < paramLen) {
                        mappingLocation = args[i + 1];
                    }
                    break;
                default:
            }
            i += 2;
        }
        ConfigOption configOption = new ConfigOption(location, tablePrefix, packageName, mappingLocation);
        generate(filePath, configOption);
    }

    public static void generate(String filePath,ConfigOption configOption) throws IOException {
        generate(new FileInputStream(filePath), configOption);
    }

    public static void generate(File file, ConfigOption configOption) throws IOException {
        generate(new FileInputStream(file), configOption);
    }

    public static void generate(InputStream inputStream, ConfigOption configOption) throws IOException {
        new EntityGenerator(getCreateTable(inputStream), configOption).generate();
    }

    private static CreateTable getCreateTable(InputStream inputStream) throws IOException {
        CharStream stream = CharStreams.fromStream(inputStream);
        TokenStream input = new CommonTokenStream(new MySqlLexer(stream));
        MySqlParser mySqlParser = new MySqlParser(input);
        MySqlParser.RootContext root = mySqlParser.root();
        CreateTableVisitor visitor = new CreateTableVisitor();
        visitor.visit(root);
        return visitor.getCreateTable();
    }

}
