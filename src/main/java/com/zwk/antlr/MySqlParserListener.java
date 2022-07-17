// Generated from D:/workspace/mysql-entity/src/main/java/com/zwk/antlr\MySqlParser.g4 by ANTLR 4.10.1
package com.zwk.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MySqlParser}.
 */
public interface MySqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MySqlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(MySqlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(MySqlParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(MySqlParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(MySqlParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(MySqlParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(MySqlParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement_(MySqlParser.EmptyStatement_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement_(MySqlParser.EmptyStatement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdlStatement(MySqlParser.DdlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdlStatement(MySqlParser.DdlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(MySqlParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(MySqlParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(MySqlParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(MySqlParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(MySqlParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(MySqlParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link MySqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterColumnCreateTable(MySqlParser.ColumnCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link MySqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitColumnCreateTable(MySqlParser.ColumnCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#commonTableExpressions}.
	 * @param ctx the parse tree
	 */
	void enterCommonTableExpressions(MySqlParser.CommonTableExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#commonTableExpressions}.
	 * @param ctx the parse tree
	 */
	void exitCommonTableExpressions(MySqlParser.CommonTableExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#cteName}.
	 * @param ctx the parse tree
	 */
	void enterCteName(MySqlParser.CteNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#cteName}.
	 * @param ctx the parse tree
	 */
	void exitCteName(MySqlParser.CteNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#cteColumnName}.
	 * @param ctx the parse tree
	 */
	void enterCteColumnName(MySqlParser.CteColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#cteColumnName}.
	 * @param ctx the parse tree
	 */
	void exitCteColumnName(MySqlParser.CteColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#charSet}.
	 * @param ctx the parse tree
	 */
	void enterCharSet(MySqlParser.CharSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#charSet}.
	 * @param ctx the parse tree
	 */
	void exitCharSet(MySqlParser.CharSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#intervalType}.
	 * @param ctx the parse tree
	 */
	void enterIntervalType(MySqlParser.IntervalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#intervalType}.
	 * @param ctx the parse tree
	 */
	void exitIntervalType(MySqlParser.IntervalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(MySqlParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(MySqlParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void enterIndexOption(MySqlParser.IndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void exitIndexOption(MySqlParser.IndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#createDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitions(MySqlParser.CreateDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#createDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitions(MySqlParser.CreateDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDeclaration(MySqlParser.ColumnDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDeclaration(MySqlParser.ColumnDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDeclaration(MySqlParser.ConstraintDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDeclaration(MySqlParser.ConstraintDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIndexDeclaration(MySqlParser.IndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link MySqlParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIndexDeclaration(MySqlParser.IndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(MySqlParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(MySqlParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterNullColumnConstraint(MySqlParser.NullColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitNullColumnConstraint(MySqlParser.NullColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterDefaultColumnConstraint(MySqlParser.DefaultColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitDefaultColumnConstraint(MySqlParser.DefaultColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code visibilityColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterVisibilityColumnConstraint(MySqlParser.VisibilityColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code visibilityColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitVisibilityColumnConstraint(MySqlParser.VisibilityColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterAutoIncrementColumnConstraint(MySqlParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitAutoIncrementColumnConstraint(MySqlParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyColumnConstraint(MySqlParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyColumnConstraint(MySqlParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKeyColumnConstraint(MySqlParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKeyColumnConstraint(MySqlParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCommentColumnConstraint(MySqlParser.CommentColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCommentColumnConstraint(MySqlParser.CommentColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterFormatColumnConstraint(MySqlParser.FormatColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitFormatColumnConstraint(MySqlParser.FormatColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterStorageColumnConstraint(MySqlParser.StorageColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitStorageColumnConstraint(MySqlParser.StorageColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterReferenceColumnConstraint(MySqlParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitReferenceColumnConstraint(MySqlParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collateColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCollateColumnConstraint(MySqlParser.CollateColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collateColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCollateColumnConstraint(MySqlParser.CollateColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generatedColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedColumnConstraint(MySqlParser.GeneratedColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generatedColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedColumnConstraint(MySqlParser.GeneratedColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code serialDefaultColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterSerialDefaultColumnConstraint(MySqlParser.SerialDefaultColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code serialDefaultColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitSerialDefaultColumnConstraint(MySqlParser.SerialDefaultColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckColumnConstraint(MySqlParser.CheckColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkColumnConstraint}
	 * labeled alternative in {@link MySqlParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckColumnConstraint(MySqlParser.CheckColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyTableConstraint(MySqlParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyTableConstraint(MySqlParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKeyTableConstraint(MySqlParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKeyTableConstraint(MySqlParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyTableConstraint(MySqlParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyTableConstraint(MySqlParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableConstraint(MySqlParser.CheckTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link MySqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableConstraint(MySqlParser.CheckTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(MySqlParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(MySqlParser.ReferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#referenceAction}.
	 * @param ctx the parse tree
	 */
	void enterReferenceAction(MySqlParser.ReferenceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#referenceAction}.
	 * @param ctx the parse tree
	 */
	void exitReferenceAction(MySqlParser.ReferenceActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#referenceControlType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceControlType(MySqlParser.ReferenceControlTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#referenceControlType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceControlType(MySqlParser.ReferenceControlTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link MySqlParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIndexDeclaration(MySqlParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link MySqlParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIndexDeclaration(MySqlParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link MySqlParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSpecialIndexDeclaration(MySqlParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link MySqlParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSpecialIndexDeclaration(MySqlParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionEngine(MySqlParser.TableOptionEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionEngine(MySqlParser.TableOptionEngineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionAutoIncrement(MySqlParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionAutoIncrement(MySqlParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionAverage(MySqlParser.TableOptionAverageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionAverage(MySqlParser.TableOptionAverageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCharset(MySqlParser.TableOptionCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCharset(MySqlParser.TableOptionCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionChecksum(MySqlParser.TableOptionChecksumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionChecksum(MySqlParser.TableOptionChecksumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCollate(MySqlParser.TableOptionCollateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCollate(MySqlParser.TableOptionCollateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionComment(MySqlParser.TableOptionCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionComment(MySqlParser.TableOptionCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCompression(MySqlParser.TableOptionCompressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCompression(MySqlParser.TableOptionCompressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionConnection(MySqlParser.TableOptionConnectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionConnection(MySqlParser.TableOptionConnectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionDataDirectory(MySqlParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionDataDirectory(MySqlParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionDelay(MySqlParser.TableOptionDelayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionDelay(MySqlParser.TableOptionDelayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionEncryption(MySqlParser.TableOptionEncryptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionEncryption(MySqlParser.TableOptionEncryptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionIndexDirectory(MySqlParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionIndexDirectory(MySqlParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionInsertMethod(MySqlParser.TableOptionInsertMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionInsertMethod(MySqlParser.TableOptionInsertMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionKeyBlockSize(MySqlParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionKeyBlockSize(MySqlParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionMaxRows(MySqlParser.TableOptionMaxRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionMaxRows(MySqlParser.TableOptionMaxRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionMinRows(MySqlParser.TableOptionMinRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionMinRows(MySqlParser.TableOptionMinRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPackKeys(MySqlParser.TableOptionPackKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPackKeys(MySqlParser.TableOptionPackKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPassword(MySqlParser.TableOptionPasswordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPassword(MySqlParser.TableOptionPasswordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionRowFormat(MySqlParser.TableOptionRowFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionRowFormat(MySqlParser.TableOptionRowFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionRecalculation(MySqlParser.TableOptionRecalculationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionRecalculation(MySqlParser.TableOptionRecalculationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPersistent(MySqlParser.TableOptionPersistentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPersistent(MySqlParser.TableOptionPersistentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionSamplePage(MySqlParser.TableOptionSamplePageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionSamplePage(MySqlParser.TableOptionSamplePageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionTablespace(MySqlParser.TableOptionTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionTablespace(MySqlParser.TableOptionTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionTableType}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionTableType(MySqlParser.TableOptionTableTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionTableType}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionTableType(MySqlParser.TableOptionTableTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionUnion(MySqlParser.TableOptionUnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link MySqlParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionUnion(MySqlParser.TableOptionUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#tableType}.
	 * @param ctx the parse tree
	 */
	void enterTableType(MySqlParser.TableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#tableType}.
	 * @param ctx the parse tree
	 */
	void exitTableType(MySqlParser.TableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 */
	void enterTablespaceStorage(MySqlParser.TablespaceStorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 */
	void exitTablespaceStorage(MySqlParser.TablespaceStorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinitions(MySqlParser.PartitionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinitions(MySqlParser.PartitionDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionHash(MySqlParser.PartitionFunctionHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionHash(MySqlParser.PartitionFunctionHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionKey(MySqlParser.PartitionFunctionKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionKey(MySqlParser.PartitionFunctionKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionRange(MySqlParser.PartitionFunctionRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionRange(MySqlParser.PartitionFunctionRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionList(MySqlParser.PartitionFunctionListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link MySqlParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionList(MySqlParser.PartitionFunctionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link MySqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubPartitionFunctionHash(MySqlParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link MySqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubPartitionFunctionHash(MySqlParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link MySqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubPartitionFunctionKey(MySqlParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link MySqlParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubPartitionFunctionKey(MySqlParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionComparison}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionComparison(MySqlParser.PartitionComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionComparison}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionComparison(MySqlParser.PartitionComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionListAtom(MySqlParser.PartitionListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionListAtom(MySqlParser.PartitionListAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionListVector(MySqlParser.PartitionListVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionListVector(MySqlParser.PartitionListVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSimple(MySqlParser.PartitionSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link MySqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSimple(MySqlParser.PartitionSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinerAtom(MySqlParser.PartitionDefinerAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinerAtom(MySqlParser.PartitionDefinerAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinerVector(MySqlParser.PartitionDefinerVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinerVector(MySqlParser.PartitionDefinerVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubpartitionDefinition(MySqlParser.SubpartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubpartitionDefinition(MySqlParser.SubpartitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionEngine(MySqlParser.PartitionOptionEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionEngine(MySqlParser.PartitionOptionEngineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionComment(MySqlParser.PartitionOptionCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionComment(MySqlParser.PartitionOptionCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionDataDirectory(MySqlParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionDataDirectory(MySqlParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionIndexDirectory(MySqlParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionIndexDirectory(MySqlParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionMaxRows(MySqlParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionMaxRows(MySqlParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionMinRows(MySqlParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionMinRows(MySqlParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionTablespace(MySqlParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionTablespace(MySqlParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionNodeGroup(MySqlParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link MySqlParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionNodeGroup(MySqlParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(MySqlParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(MySqlParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByTableOption(MySqlParser.AlterByTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByTableOption(MySqlParser.AlterByTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddColumn(MySqlParser.AlterByAddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddColumn(MySqlParser.AlterByAddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddColumns(MySqlParser.AlterByAddColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddColumns(MySqlParser.AlterByAddColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddIndex(MySqlParser.AlterByAddIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddIndex(MySqlParser.AlterByAddIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddPrimaryKey(MySqlParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddPrimaryKey(MySqlParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddUniqueKey(MySqlParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddUniqueKey(MySqlParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddSpecialIndex(MySqlParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddSpecialIndex(MySqlParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddForeignKey(MySqlParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddForeignKey(MySqlParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddCheckTableConstraint}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddCheckTableConstraint(MySqlParser.AlterByAddCheckTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddCheckTableConstraint}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddCheckTableConstraint(MySqlParser.AlterByAddCheckTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterBySetAlgorithm(MySqlParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterBySetAlgorithm(MySqlParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByChangeDefault(MySqlParser.AlterByChangeDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByChangeDefault(MySqlParser.AlterByChangeDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByChangeColumn(MySqlParser.AlterByChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByChangeColumn(MySqlParser.AlterByChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRenameColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRenameColumn(MySqlParser.AlterByRenameColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRenameColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRenameColumn(MySqlParser.AlterByRenameColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByLock(MySqlParser.AlterByLockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByLock(MySqlParser.AlterByLockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByModifyColumn(MySqlParser.AlterByModifyColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByModifyColumn(MySqlParser.AlterByModifyColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropColumn(MySqlParser.AlterByDropColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropColumn(MySqlParser.AlterByDropColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropConstraintCheck}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropConstraintCheck(MySqlParser.AlterByDropConstraintCheckContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropConstraintCheck}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropConstraintCheck(MySqlParser.AlterByDropConstraintCheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropPrimaryKey(MySqlParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropPrimaryKey(MySqlParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRenameIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRenameIndex(MySqlParser.AlterByRenameIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRenameIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRenameIndex(MySqlParser.AlterByRenameIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAlterIndexVisibility}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAlterIndexVisibility(MySqlParser.AlterByAlterIndexVisibilityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAlterIndexVisibility}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAlterIndexVisibility(MySqlParser.AlterByAlterIndexVisibilityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropIndex(MySqlParser.AlterByDropIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropIndex(MySqlParser.AlterByDropIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropForeignKey(MySqlParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropForeignKey(MySqlParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDisableKeys(MySqlParser.AlterByDisableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDisableKeys(MySqlParser.AlterByDisableKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByEnableKeys(MySqlParser.AlterByEnableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByEnableKeys(MySqlParser.AlterByEnableKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRename(MySqlParser.AlterByRenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRename(MySqlParser.AlterByRenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByOrder(MySqlParser.AlterByOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByOrder(MySqlParser.AlterByOrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByConvertCharset(MySqlParser.AlterByConvertCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByConvertCharset(MySqlParser.AlterByConvertCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDefaultCharset(MySqlParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDefaultCharset(MySqlParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDiscardTablespace(MySqlParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDiscardTablespace(MySqlParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByImportTablespace(MySqlParser.AlterByImportTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByImportTablespace(MySqlParser.AlterByImportTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByForce(MySqlParser.AlterByForceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByForce(MySqlParser.AlterByForceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByValidate(MySqlParser.AlterByValidateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByValidate(MySqlParser.AlterByValidateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddPartition(MySqlParser.AlterByAddPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddPartition(MySqlParser.AlterByAddPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropPartition(MySqlParser.AlterByDropPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropPartition(MySqlParser.AlterByDropPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDiscardPartition(MySqlParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDiscardPartition(MySqlParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByImportPartition(MySqlParser.AlterByImportPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByImportPartition(MySqlParser.AlterByImportPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByTruncatePartition(MySqlParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByTruncatePartition(MySqlParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByCoalescePartition(MySqlParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByCoalescePartition(MySqlParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByReorganizePartition(MySqlParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByReorganizePartition(MySqlParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByExchangePartition(MySqlParser.AlterByExchangePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByExchangePartition(MySqlParser.AlterByExchangePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAnalyzePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAnalyzePartition(MySqlParser.AlterByAnalyzePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAnalyzePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAnalyzePartition(MySqlParser.AlterByAnalyzePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByCheckPartition(MySqlParser.AlterByCheckPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByCheckPartition(MySqlParser.AlterByCheckPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByOptimizePartition(MySqlParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByOptimizePartition(MySqlParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRebuildPartition(MySqlParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRebuildPartition(MySqlParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRepairPartition(MySqlParser.AlterByRepairPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRepairPartition(MySqlParser.AlterByRepairPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRemovePartitioning(MySqlParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRemovePartitioning(MySqlParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByUpgradePartitioning(MySqlParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link MySqlParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByUpgradePartitioning(MySqlParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(MySqlParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(MySqlParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(MySqlParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(MySqlParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(MySqlParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(MySqlParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#renameTableClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableClause(MySqlParser.RenameTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#renameTableClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableClause(MySqlParser.RenameTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(MySqlParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(MySqlParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(MySqlParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(MySqlParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(MySqlParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(MySqlParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#replaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterReplaceStatement(MySqlParser.ReplaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#replaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitReplaceStatement(MySqlParser.ReplaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelect(MySqlParser.SimpleSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelect(MySqlParser.SimpleSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisSelect(MySqlParser.ParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisSelect(MySqlParser.ParenthesisSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionSelect(MySqlParser.UnionSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionSelect(MySqlParser.UnionSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionParenthesisSelect(MySqlParser.UnionParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionParenthesisSelect(MySqlParser.UnionParenthesisSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(MySqlParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(MySqlParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#insertStatementValue}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatementValue(MySqlParser.InsertStatementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#insertStatementValue}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatementValue(MySqlParser.InsertStatementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#updatedElement}.
	 * @param ctx the parse tree
	 */
	void enterUpdatedElement(MySqlParser.UpdatedElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#updatedElement}.
	 * @param ctx the parse tree
	 */
	void exitUpdatedElement(MySqlParser.UpdatedElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#assignmentField}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentField(MySqlParser.AssignmentFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#assignmentField}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentField(MySqlParser.AssignmentFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(MySqlParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(MySqlParser.LockClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleDeleteStatement(MySqlParser.SingleDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleDeleteStatement(MySqlParser.SingleDeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleDeleteStatement(MySqlParser.MultipleDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleDeleteStatement(MySqlParser.MultipleDeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleUpdateStatement(MySqlParser.SingleUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleUpdateStatement(MySqlParser.SingleUpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleUpdateStatement(MySqlParser.MultipleUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleUpdateStatement(MySqlParser.MultipleUpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(MySqlParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(MySqlParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(MySqlParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(MySqlParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(MySqlParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(MySqlParser.TableSourcesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link MySqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceBase(MySqlParser.TableSourceBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link MySqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceBase(MySqlParser.TableSourceBaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link MySqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceNested(MySqlParser.TableSourceNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link MySqlParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceNested(MySqlParser.TableSourceNestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterAtomTableItem(MySqlParser.AtomTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitAtomTableItem(MySqlParser.AtomTableItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryTableItem(MySqlParser.SubqueryTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryTableItem(MySqlParser.SubqueryTableItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterTableSourcesItem(MySqlParser.TableSourcesItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link MySqlParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitTableSourcesItem(MySqlParser.TableSourcesItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void enterIndexHint(MySqlParser.IndexHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void exitIndexHint(MySqlParser.IndexHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#indexHintType}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintType(MySqlParser.IndexHintTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#indexHintType}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintType(MySqlParser.IndexHintTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoin(MySqlParser.InnerJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoin(MySqlParser.InnerJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterStraightJoin(MySqlParser.StraightJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitStraightJoin(MySqlParser.StraightJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoin(MySqlParser.OuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoin(MySqlParser.OuterJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoin(MySqlParser.NaturalJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link MySqlParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoin(MySqlParser.NaturalJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(MySqlParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(MySqlParser.QueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionNointo(MySqlParser.QueryExpressionNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionNointo(MySqlParser.QueryExpressionNointoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(MySqlParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(MySqlParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecificationNointo(MySqlParser.QuerySpecificationNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecificationNointo(MySqlParser.QuerySpecificationNointoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#unionParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterUnionParenthesis(MySqlParser.UnionParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#unionParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitUnionParenthesis(MySqlParser.UnionParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#unionStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionStatement(MySqlParser.UnionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#unionStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionStatement(MySqlParser.UnionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpec(MySqlParser.SelectSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpec(MySqlParser.SelectSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(MySqlParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(MySqlParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStarElement(MySqlParser.SelectStarElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStarElement(MySqlParser.SelectStarElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumnElement(MySqlParser.SelectColumnElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumnElement(MySqlParser.SelectColumnElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectFunctionElement(MySqlParser.SelectFunctionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectFunctionElement(MySqlParser.SelectFunctionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpressionElement(MySqlParser.SelectExpressionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link MySqlParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpressionElement(MySqlParser.SelectExpressionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoVariables(MySqlParser.SelectIntoVariablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoVariables(MySqlParser.SelectIntoVariablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoDumpFile(MySqlParser.SelectIntoDumpFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoDumpFile(MySqlParser.SelectIntoDumpFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoTextFile(MySqlParser.SelectIntoTextFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link MySqlParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoTextFile(MySqlParser.SelectIntoTextFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectFieldsInto(MySqlParser.SelectFieldsIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectFieldsInto(MySqlParser.SelectFieldsIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectLinesInto(MySqlParser.SelectLinesIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectLinesInto(MySqlParser.SelectLinesIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(MySqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(MySqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(MySqlParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(MySqlParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(MySqlParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(MySqlParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(MySqlParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(MySqlParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(MySqlParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(MySqlParser.GroupByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(MySqlParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(MySqlParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 */
	void enterLimitClauseAtom(MySqlParser.LimitClauseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 */
	void exitLimitClauseAtom(MySqlParser.LimitClauseAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBody(MySqlParser.RoutineBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBody(MySqlParser.RoutineBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(MySqlParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(MySqlParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(MySqlParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(MySqlParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MySqlParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MySqlParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterateStatement(MySqlParser.IterateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterateStatement(MySqlParser.IterateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void enterLeaveStatement(MySqlParser.LeaveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void exitLeaveStatement(MySqlParser.LeaveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(MySqlParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(MySqlParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(MySqlParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(MySqlParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MySqlParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MySqlParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MySqlParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MySqlParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCloseCursor(MySqlParser.CloseCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCloseCursor(MySqlParser.CloseCursorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterFetchCursor(MySqlParser.FetchCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitFetchCursor(MySqlParser.FetchCursorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpenCursor(MySqlParser.OpenCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link MySqlParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpenCursor(MySqlParser.OpenCursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVariable(MySqlParser.DeclareVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVariable(MySqlParser.DeclareVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#declareCondition}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCondition(MySqlParser.DeclareConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#declareCondition}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCondition(MySqlParser.DeclareConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#declareCursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCursor(MySqlParser.DeclareCursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#declareCursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCursor(MySqlParser.DeclareCursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#declareHandler}.
	 * @param ctx the parse tree
	 */
	void enterDeclareHandler(MySqlParser.DeclareHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#declareHandler}.
	 * @param ctx the parse tree
	 */
	void exitDeclareHandler(MySqlParser.DeclareHandlerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionCode(MySqlParser.HandlerConditionCodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionCode(MySqlParser.HandlerConditionCodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionState(MySqlParser.HandlerConditionStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionState(MySqlParser.HandlerConditionStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionName(MySqlParser.HandlerConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionName(MySqlParser.HandlerConditionNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionWarning(MySqlParser.HandlerConditionWarningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionWarning(MySqlParser.HandlerConditionWarningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionNotfound(MySqlParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionNotfound(MySqlParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionException(MySqlParser.HandlerConditionExceptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link MySqlParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionException(MySqlParser.HandlerConditionExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureSqlStatement(MySqlParser.ProcedureSqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureSqlStatement(MySqlParser.ProcedureSqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#caseAlternative}.
	 * @param ctx the parse tree
	 */
	void enterCaseAlternative(MySqlParser.CaseAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#caseAlternative}.
	 * @param ctx the parse tree
	 */
	void exitCaseAlternative(MySqlParser.CaseAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#elifAlternative}.
	 * @param ctx the parse tree
	 */
	void enterElifAlternative(MySqlParser.ElifAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#elifAlternative}.
	 * @param ctx the parse tree
	 */
	void exitElifAlternative(MySqlParser.ElifAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#fullId}.
	 * @param ctx the parse tree
	 */
	void enterFullId(MySqlParser.FullIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#fullId}.
	 * @param ctx the parse tree
	 */
	void exitFullId(MySqlParser.FullIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(MySqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(MySqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(MySqlParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(MySqlParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#indexColumnName}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnName(MySqlParser.IndexColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#indexColumnName}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnName(MySqlParser.IndexColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#mysqlVariable}.
	 * @param ctx the parse tree
	 */
	void enterMysqlVariable(MySqlParser.MysqlVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#mysqlVariable}.
	 * @param ctx the parse tree
	 */
	void exitMysqlVariable(MySqlParser.MysqlVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(MySqlParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(MySqlParser.CharsetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(MySqlParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(MySqlParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#engineName}.
	 * @param ctx the parse tree
	 */
	void enterEngineName(MySqlParser.EngineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#engineName}.
	 * @param ctx the parse tree
	 */
	void exitEngineName(MySqlParser.EngineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(MySqlParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(MySqlParser.UidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#simpleId}.
	 * @param ctx the parse tree
	 */
	void enterSimpleId(MySqlParser.SimpleIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#simpleId}.
	 * @param ctx the parse tree
	 */
	void exitSimpleId(MySqlParser.SimpleIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void enterDottedId(MySqlParser.DottedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void exitDottedId(MySqlParser.DottedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(MySqlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(MySqlParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFileSizeLiteral(MySqlParser.FileSizeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFileSizeLiteral(MySqlParser.FileSizeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(MySqlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(MySqlParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(MySqlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(MySqlParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(MySqlParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(MySqlParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void enterNullNotnull(MySqlParser.NullNotnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void exitNullNotnull(MySqlParser.NullNotnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MySqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MySqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterStringDataType(MySqlParser.StringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitStringDataType(MySqlParser.StringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nationalStringDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterNationalStringDataType(MySqlParser.NationalStringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nationalStringDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitNationalStringDataType(MySqlParser.NationalStringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nationalVaryingStringDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterNationalVaryingStringDataType(MySqlParser.NationalVaryingStringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nationalVaryingStringDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitNationalVaryingStringDataType(MySqlParser.NationalVaryingStringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDimensionDataType(MySqlParser.DimensionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDimensionDataType(MySqlParser.DimensionDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDataType(MySqlParser.SimpleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDataType(MySqlParser.SimpleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterCollectionDataType(MySqlParser.CollectionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitCollectionDataType(MySqlParser.CollectionDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterSpatialDataType(MySqlParser.SpatialDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitSpatialDataType(MySqlParser.SpatialDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code longVarcharDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterLongVarcharDataType(MySqlParser.LongVarcharDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code longVarcharDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitLongVarcharDataType(MySqlParser.LongVarcharDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code longVarbinaryDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterLongVarbinaryDataType(MySqlParser.LongVarbinaryDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code longVarbinaryDataType}
	 * labeled alternative in {@link MySqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitLongVarbinaryDataType(MySqlParser.LongVarbinaryDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#collectionOptions}.
	 * @param ctx the parse tree
	 */
	void enterCollectionOptions(MySqlParser.CollectionOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#collectionOptions}.
	 * @param ctx the parse tree
	 */
	void exitCollectionOptions(MySqlParser.CollectionOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#convertedDataType}.
	 * @param ctx the parse tree
	 */
	void enterConvertedDataType(MySqlParser.ConvertedDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#convertedDataType}.
	 * @param ctx the parse tree
	 */
	void exitConvertedDataType(MySqlParser.ConvertedDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthOneDimension(MySqlParser.LengthOneDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthOneDimension(MySqlParser.LengthOneDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoDimension(MySqlParser.LengthTwoDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoDimension(MySqlParser.LengthTwoDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoOptionalDimension(MySqlParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoOptionalDimension(MySqlParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#uidList}.
	 * @param ctx the parse tree
	 */
	void enterUidList(MySqlParser.UidListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#uidList}.
	 * @param ctx the parse tree
	 */
	void exitUidList(MySqlParser.UidListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#tables}.
	 * @param ctx the parse tree
	 */
	void enterTables(MySqlParser.TablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#tables}.
	 * @param ctx the parse tree
	 */
	void exitTables(MySqlParser.TablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#indexColumnNames}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnNames(MySqlParser.IndexColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#indexColumnNames}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnNames(MySqlParser.IndexColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(MySqlParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(MySqlParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsWithDefaults(MySqlParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsWithDefaults(MySqlParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(MySqlParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(MySqlParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#currentTimestamp}.
	 * @param ctx the parse tree
	 */
	void enterCurrentTimestamp(MySqlParser.CurrentTimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#currentTimestamp}.
	 * @param ctx the parse tree
	 */
	void exitCurrentTimestamp(MySqlParser.CurrentTimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOrDefault(MySqlParser.ExpressionOrDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOrDefault(MySqlParser.ExpressionOrDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(MySqlParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(MySqlParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(MySqlParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(MySqlParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSpecificFunctionCall(MySqlParser.SpecificFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSpecificFunctionCall(MySqlParser.SpecificFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctionCall(MySqlParser.AggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctionCall(MySqlParser.AggregateFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonAggregateFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterNonAggregateFunctionCall(MySqlParser.NonAggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonAggregateFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitNonAggregateFunctionCall(MySqlParser.NonAggregateFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionCall(MySqlParser.ScalarFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionCall(MySqlParser.ScalarFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterUdfFunctionCall(MySqlParser.UdfFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitUdfFunctionCall(MySqlParser.UdfFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFunctionCall(MySqlParser.PasswordFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link MySqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFunctionCall(MySqlParser.PasswordFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFunctionCall(MySqlParser.SimpleFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFunctionCall(MySqlParser.SimpleFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeFunctionCall(MySqlParser.DataTypeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeFunctionCall(MySqlParser.DataTypeFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterValuesFunctionCall(MySqlParser.ValuesFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitValuesFunctionCall(MySqlParser.ValuesFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseExpressionFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpressionFunctionCall(MySqlParser.CaseExpressionFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseExpressionFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpressionFunctionCall(MySqlParser.CaseExpressionFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCaseFunctionCall(MySqlParser.CaseFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCaseFunctionCall(MySqlParser.CaseFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunctionCall(MySqlParser.CharFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunctionCall(MySqlParser.CharFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunctionCall(MySqlParser.PositionFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunctionCall(MySqlParser.PositionFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstrFunctionCall(MySqlParser.SubstrFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstrFunctionCall(MySqlParser.SubstrFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunctionCall(MySqlParser.TrimFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunctionCall(MySqlParser.TrimFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterWeightFunctionCall(MySqlParser.WeightFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitWeightFunctionCall(MySqlParser.WeightFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunctionCall(MySqlParser.ExtractFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunctionCall(MySqlParser.ExtractFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterGetFormatFunctionCall(MySqlParser.GetFormatFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitGetFormatFunctionCall(MySqlParser.GetFormatFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonValueFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsonValueFunctionCall(MySqlParser.JsonValueFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonValueFunctionCall}
	 * labeled alternative in {@link MySqlParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsonValueFunctionCall(MySqlParser.JsonValueFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void enterCaseFuncAlternative(MySqlParser.CaseFuncAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void exitCaseFuncAlternative(MySqlParser.CaseFuncAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link MySqlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void enterLevelWeightList(MySqlParser.LevelWeightListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link MySqlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void exitLevelWeightList(MySqlParser.LevelWeightListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link MySqlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void enterLevelWeightRange(MySqlParser.LevelWeightRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link MySqlParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void exitLevelWeightRange(MySqlParser.LevelWeightRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void enterLevelInWeightListElement(MySqlParser.LevelInWeightListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void exitLevelInWeightListElement(MySqlParser.LevelInWeightListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWindowedFunction(MySqlParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWindowedFunction(MySqlParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#nonAggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterNonAggregateWindowedFunction(MySqlParser.NonAggregateWindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#nonAggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitNonAggregateWindowedFunction(MySqlParser.NonAggregateWindowedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#overClause}.
	 * @param ctx the parse tree
	 */
	void enterOverClause(MySqlParser.OverClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#overClause}.
	 * @param ctx the parse tree
	 */
	void exitOverClause(MySqlParser.OverClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpec(MySqlParser.WindowSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpec(MySqlParser.WindowSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#windowName}.
	 * @param ctx the parse tree
	 */
	void enterWindowName(MySqlParser.WindowNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#windowName}.
	 * @param ctx the parse tree
	 */
	void exitWindowName(MySqlParser.WindowNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause(MySqlParser.FrameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause(MySqlParser.FrameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#frameUnits}.
	 * @param ctx the parse tree
	 */
	void enterFrameUnits(MySqlParser.FrameUnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#frameUnits}.
	 * @param ctx the parse tree
	 */
	void exitFrameUnits(MySqlParser.FrameUnitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#frameExtent}.
	 * @param ctx the parse tree
	 */
	void enterFrameExtent(MySqlParser.FrameExtentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#frameExtent}.
	 * @param ctx the parse tree
	 */
	void exitFrameExtent(MySqlParser.FrameExtentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void enterFrameBetween(MySqlParser.FrameBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void exitFrameBetween(MySqlParser.FrameBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#frameRange}.
	 * @param ctx the parse tree
	 */
	void enterFrameRange(MySqlParser.FrameRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#frameRange}.
	 * @param ctx the parse tree
	 */
	void exitFrameRange(MySqlParser.FrameRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionClause(MySqlParser.PartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionClause(MySqlParser.PartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionName(MySqlParser.ScalarFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionName(MySqlParser.ScalarFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFunctionClause(MySqlParser.PasswordFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFunctionClause(MySqlParser.PasswordFunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(MySqlParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(MySqlParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(MySqlParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(MySqlParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(MySqlParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(MySqlParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(MySqlParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(MySqlParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(MySqlParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(MySqlParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExpression(MySqlParser.PredicateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link MySqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExpression(MySqlParser.PredicateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSoundsLikePredicate(MySqlParser.SoundsLikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSoundsLikePredicate(MySqlParser.SoundsLikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtomPredicate(MySqlParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtomPredicate(MySqlParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryComparisonPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryComparisonPredicate(MySqlParser.SubqueryComparisonPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryComparisonPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryComparisonPredicate(MySqlParser.SubqueryComparisonPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonMemberOfPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterJsonMemberOfPredicate(MySqlParser.JsonMemberOfPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonMemberOfPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitJsonMemberOfPredicate(MySqlParser.JsonMemberOfPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryComparisonPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComparisonPredicate(MySqlParser.BinaryComparisonPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryComparisonPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComparisonPredicate(MySqlParser.BinaryComparisonPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(MySqlParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(MySqlParser.InPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPredicate(MySqlParser.BetweenPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPredicate(MySqlParser.BetweenPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterIsNullPredicate(MySqlParser.IsNullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitIsNullPredicate(MySqlParser.IsNullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(MySqlParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(MySqlParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterRegexpPredicate(MySqlParser.RegexpPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link MySqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitRegexpPredicate(MySqlParser.RegexpPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionAtom(MySqlParser.UnaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionAtom(MySqlParser.UnaryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterCollateExpressionAtom(MySqlParser.CollateExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitCollateExpressionAtom(MySqlParser.CollateExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMysqlVariableExpressionAtom(MySqlParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMysqlVariableExpressionAtom(MySqlParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpressionAtom(MySqlParser.NestedExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpressionAtom(MySqlParser.NestedExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedRowExpressionAtom(MySqlParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedRowExpressionAtom(MySqlParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionAtom(MySqlParser.MathExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionAtom(MySqlParser.MathExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existsExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterExistsExpressionAtom(MySqlParser.ExistsExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existsExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitExistsExpressionAtom(MySqlParser.ExistsExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpressionAtom(MySqlParser.IntervalExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpressionAtom(MySqlParser.IntervalExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jsonExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterJsonExpressionAtom(MySqlParser.JsonExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jsonExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitJsonExpressionAtom(MySqlParser.JsonExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpressionAtom(MySqlParser.SubqueryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpressionAtom(MySqlParser.SubqueryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpressionAtom(MySqlParser.ConstantExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpressionAtom(MySqlParser.ConstantExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpressionAtom(MySqlParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpressionAtom(MySqlParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionAtom(MySqlParser.BinaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionAtom(MySqlParser.BinaryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnNameExpressionAtom(MySqlParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnNameExpressionAtom(MySqlParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBitExpressionAtom(MySqlParser.BitExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link MySqlParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBitExpressionAtom(MySqlParser.BitExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(MySqlParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(MySqlParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(MySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(MySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(MySqlParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(MySqlParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitOperator(MySqlParser.BitOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitOperator(MySqlParser.BitOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(MySqlParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(MySqlParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void enterJsonOperator(MySqlParser.JsonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#jsonOperator}.
	 * @param ctx the parse tree
	 */
	void exitJsonOperator(MySqlParser.JsonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#charsetNameBase}.
	 * @param ctx the parse tree
	 */
	void enterCharsetNameBase(MySqlParser.CharsetNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#charsetNameBase}.
	 * @param ctx the parse tree
	 */
	void exitCharsetNameBase(MySqlParser.CharsetNameBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 */
	void enterTransactionLevelBase(MySqlParser.TransactionLevelBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 */
	void exitTransactionLevelBase(MySqlParser.TransactionLevelBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#privilegesBase}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegesBase(MySqlParser.PrivilegesBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#privilegesBase}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegesBase(MySqlParser.PrivilegesBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 */
	void enterIntervalTypeBase(MySqlParser.IntervalTypeBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 */
	void exitIntervalTypeBase(MySqlParser.IntervalTypeBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#dataTypeBase}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeBase(MySqlParser.DataTypeBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#dataTypeBase}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeBase(MySqlParser.DataTypeBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void enterKeywordsCanBeId(MySqlParser.KeywordsCanBeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void exitKeywordsCanBeId(MySqlParser.KeywordsCanBeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNameBase(MySqlParser.FunctionNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNameBase(MySqlParser.FunctionNameBaseContext ctx);
}