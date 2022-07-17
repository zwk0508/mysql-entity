package com.zwk.parser;

import java.util.ArrayList;
import java.util.List;

public class CreateTable {

    private String tableName;

    private List<ColumnDeclaration> columns = new ArrayList<>();

    private CreateTable next;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }


    public CreateTable getNext() {
        return next;
    }

    public void setNext(CreateTable next) {
        this.next = next;
    }

    public List<ColumnDeclaration> getColumns() {
        return columns;
    }

    public void addColumn(ColumnDeclaration columnDeclaration){
        columns.add(columnDeclaration);
    }
}
