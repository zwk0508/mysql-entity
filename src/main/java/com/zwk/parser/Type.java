package com.zwk.parser;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Type {
    ARRAY("java.sql.Array"),
    BOOLEAN("Boolean"),
    BIT("Boolean"),
    TINYINT("Integer"),
    SMALLINT("Integer"),
    MEDIUMINT("Integer"),
    INT("Integer"),
    INTEGER("Integer"),
    BIGINT("Long"),
    FLOAT("Float"),
    REAL("Float"),
    DOUBLE("Double"),
    NUMERIC("java.math.BigDecimal"),
    DECIMAL("java.math.BigDecimal"),
    CHAR("String"),
    NCHAR("String"),
    VARCHAR("String"),
    NVARCHAR("String"),
    LONGVARCHAR("String"),
    TEXT("String"),
    MEDIUMTEXT("String"),
    LONGTEXT("String"),
    BINARY("byte[]"),
    VARBINARY("byte[]"),
    LONGVARBINARY("byte[]"),
    CLOB("java.sql.Clob"),
    BLOB("java.sql.Blob"),
    DATE("java.sql.Date"),
    TIME("java.sql.Time"),
    DATETIME("java.sql.Timestamp"),
    TIMESTAMP("java.sql.Timestamp"),
    YEAR("java.sql.Date");

    Type(String javaType) {
        this.javaType = javaType;
    }

    private String javaType;

    public String getJavaType() {
        return javaType;
    }

    public static Type getType(String type) {
        return cache.get(type);
    }

    private static final Map<String, Type> cache;

    static {
        cache = Stream.of(values()).collect(Collectors.toMap(Enum::name, v -> v));
    }
}
