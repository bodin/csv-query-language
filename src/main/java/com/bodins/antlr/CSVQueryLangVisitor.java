// Generated from CSVQueryLang.g4 by ANTLR 4.9.2

package com.bodins.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSVQueryLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSVQueryLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSVQueryLangParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(CSVQueryLangParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithFile}
	 * labeled alternative in {@link CSVQueryLangParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithFile(CSVQueryLangParser.WithFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectSome}
	 * labeled alternative in {@link CSVQueryLangParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSome(CSVQueryLangParser.SelectSomeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectAll}
	 * labeled alternative in {@link CSVQueryLangParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAll(CSVQueryLangParser.SelectAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterSome}
	 * labeled alternative in {@link CSVQueryLangParser#filter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterSome(CSVQueryLangParser.FilterSomeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterNone}
	 * labeled alternative in {@link CSVQueryLangParser#filter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterNone(CSVQueryLangParser.FilterNoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(CSVQueryLangParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEquals}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEquals(CSVQueryLangParser.ExprEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNested}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNested(CSVQueryLangParser.ExprNestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(CSVQueryLangParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(CSVQueryLangParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprContains}
	 * labeled alternative in {@link CSVQueryLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprContains(CSVQueryLangParser.ExprContainsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteFile}
	 * labeled alternative in {@link CSVQueryLangParser#out_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteFile(CSVQueryLangParser.WriteFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link CSVQueryLangParser#out_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CSVQueryLangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVQueryLangParser#cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCols(CSVQueryLangParser.ColsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVQueryLangParser#col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol(CSVQueryLangParser.ColContext ctx);
}