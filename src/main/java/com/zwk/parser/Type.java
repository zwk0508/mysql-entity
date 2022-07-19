package com.zwk.parser;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Type {
    VARCHAR("String"),
    CHAR("String"),
    BLOB("byte[]"),
    TEXT("String"),
    INTEGER("Integer"),
    TINYINT("Integer"),
    SMALLINT("Integer"),
    MEDIUMINT("Integer"),
    BIT("Boolean"),
    BIGINT("Long"),
    FLOAT("Float"),
    DOUBLE("Double"),
    DECIMAL("java.math.BigDecimal"),
    BOOLEAN("Boolean"),
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
