package com.zwk.parser;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Type {
    VARCHAR("String"),
    CHAR("String"),
    BLOB("byte[]"),
    TEXT("String"),
    INTEGER("java.lang.Integer"),
    TINYINT("java.lang.Integer"),
    SMALLINT("java.lang.Integer"),
    MEDIUMINT("java.lang.Integer"),
    BIT("java.lang.Boolean"),
    BIGINT("java.lang.Long"),
    FLOAT("java.lang.Float"),
    DOUBLE("java.lang.Double"),
    DECIMAL("java.math.BigDecimal"),
    BOOLEAN("java.lang.Boolean"),
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
