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
	 * Enter a parse tree produced by the {@code SelectSome}
	 * labeled alternative in {@link CSVQueryLangParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelectSome(CSVQueryLangParser.SelectSomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectSome}
	 * labeled alternative in {@link CSVQueryLangParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelectSome(CSVQueryLangParser.SelectSomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectAll}
	 * labeled alternative in {@link CSVQueryLangParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelectAll(CSVQueryLangParser.SelectAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectAll}
	 * labeled alternative in {@link CSVQueryLangParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelectAll(CSVQueryLangParser.SelectAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterSome}
	 * labeled alternative in {@link CSVQueryLangParser#filter_clause}.
	 * @param ctx the parse tree
	 */
	void enterFilterSome(CSVQueryLangParser.FilterSomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterSome}
	 * labeled alternative in {@link CSVQueryLangParser#filter_clause}.
	 * @param ctx the parse tree
	 */
	void exitFilterSome(CSVQueryLangParser.FilterSomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterNone}
	 * labeled alternative in {@link CSVQueryLangParser#filter_clause}.
	 * @param ctx the parse tree
	 */
	void enterFilterNone(CSVQueryLangParser.FilterNoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterNone}
	 * labeled alternative in {@link CSVQueryLangParser#filter_clause}.
	 * @param ctx the parse tree
	 */
	void exitFilterNone(CSVQueryLangParser.FilterNoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(CSVQueryLangParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(CSVQueryLangParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEquals}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprEquals(CSVQueryLangParser.ExprEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEquals}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprEquals(CSVQueryLangParser.ExprEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNested}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNested(CSVQueryLangParser.ExprNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNested}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNested(CSVQueryLangParser.ExprNestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(CSVQueryLangParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(CSVQueryLangParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(CSVQueryLangParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(CSVQueryLangParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprContains}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprContains(CSVQueryLangParser.ExprContainsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprContains}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprContains(CSVQueryLangParser.ExprContainsContext ctx);
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