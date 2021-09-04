// Generated from CSVQueryLang.g4 by ANTLR 4.9.2

package com.bodins.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSVQueryLangParser}.
 */
public interface CSVQueryLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSVQueryLangParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(CSVQueryLangParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVQueryLangParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(CSVQueryLangParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithFile}
	 * labeled alternative in {@link CSVQueryLangParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWithFile(CSVQueryLangParser.WithFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithFile}
	 * labeled alternative in {@link CSVQueryLangParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWithFile(CSVQueryLangParser.WithFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVQueryLangParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(CSVQueryLangParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVQueryLangParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(CSVQueryLangParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteFile}
	 * labeled alternative in {@link CSVQueryLangParser#out_clause}.
	 * @param ctx the parse tree
	 */
	void enterWriteFile(CSVQueryLangParser.WriteFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteFile}
	 * labeled alternative in {@link CSVQueryLangParser#out_clause}.
	 * @param ctx the parse tree
	 */
	void exitWriteFile(CSVQueryLangParser.WriteFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link CSVQueryLangParser#out_clause}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CSVQueryLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link CSVQueryLangParser#out_clause}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CSVQueryLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVQueryLangParser#cols}.
	 * @param ctx the parse tree
	 */
	void enterCols(CSVQueryLangParser.ColsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVQueryLangParser#cols}.
	 * @param ctx the parse tree
	 */
	void exitCols(CSVQueryLangParser.ColsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVQueryLangParser#col}.
	 * @param ctx the parse tree
	 */
	void enterCol(CSVQueryLangParser.ColContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVQueryLangParser#col}.
	 * @param ctx the parse tree
	 */
	void exitCol(CSVQueryLangParser.ColContext ctx);
}