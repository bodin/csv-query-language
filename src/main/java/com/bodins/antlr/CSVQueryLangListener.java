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