package com.zwk.parser;

import com.zwk.antlr.MySqlParser;
import com.zwk.antlr.MySqlParserBaseVisitor;

import java.util.List;

public class CreateTableVisitor extends MySqlParserBaseVisitor<Void> {
    private CreateTable createTable = null;
    private CreateTable currentCreateTable = null;
    private ColumnDeclaration currentColumnDeclaration = null;

    public CreateTable getCreateTable() {
        return createTable;
    }

    @Override
    public Void visitColumnCreateTable(MySqlParser.ColumnCreateTableContext ctx) {
        CreateTable nextCreateTable = new CreateTable();
        if (createTable == null) {
            createTable = nextCreateTable;
        } else {
            currentCreateTable.setNext(nextCreateTable);
        }
        currentCreateTable = nextCreateTable;
        visit(ctx.tableName());
        visit(ctx.createDefinitions());
        return null;
    }

    @Override
    public Void visitTableName(MySqlParser.TableNameContext ctx) {
        String text = ctx.getText();
        if (currentCreateTable != null) {
            currentCreateTable.setTableName(trim(text));
        }
        return null;
    }

    @Override
    public Void visitColumnDeclaration(MySqlParser.ColumnDeclarationContext ctx) {
        currentColumnDeclaration = new ColumnDeclaration();
        MySqlParser.UidContext uid = ctx.uid();
        String text = uid.getText();
        currentColumnDeclaration.setColumnName(trim(text));
        visit(ctx.columnDefinition());
        currentCreateTable.addColumn(currentColumnDeclaration);
        return null;
    }

    @Override
    public Void visitColumnDefinition(MySqlParser.ColumnDefinitionContext ctx) {
        MySqlParser.DataTypeContext dataTypeContext = ctx.dataType();
        String text = dataTypeContext.getText();
        currentColumnDeclaration.setDataType(text);
        List<MySqlParser.ColumnConstraintContext> columnConstraintContexts = ctx.columnConstraint();
        if (columnConstraintContexts != null) {
            columnConstraintContexts.forEach(this::visit);
        }
        return null;
    }

    @Override
    public Void visitCommentColumnConstraint(MySqlParser.CommentColumnConstraintContext ctx) {
        String text = ctx.STRING_LITERAL().getText();
        currentColumnDeclaration.setComment(text.substring(1, text.length() - 1));
        return null;
    }


    private String trim(String text) {
        if (text.startsWith("`")) {
            text = text.substring(1);
        }
        if (text.endsWith("`")) {
            text = text.substring(0, text.length() - 1);
        }
        return text;
    }
}
