package com.bodins.model;

import com.bodins.antlr.CSVQueryLangBaseListener;
import com.bodins.antlr.CSVQueryLangBaseVisitor;
import com.bodins.antlr.CSVQueryLangParser;
import com.bodins.model.filter.*;
import com.bodins.model.input.FileInput;
import com.bodins.model.output.FileOutput;
import com.bodins.model.output.PrintOutput;

import java.util.List;
import java.util.stream.Collectors;

public class Listener extends CSVQueryLangBaseListener {
    private final CSVProcessOptions options = new CSVProcessOptions();

    public CSVProcessOptions getOptions() {
        return options;
    }

    @Override
    public void enterWithFile(CSVQueryLangParser.WithFileContext ctx) {
        this.options.setInput(new FileInput(ctx.FILE_NAME().getText()));
    }

    @Override
    public void enterPrint(CSVQueryLangParser.PrintContext ctx) {
        this.options.setOutput(new PrintOutput());
    }

    @Override
    public void enterWriteFile(CSVQueryLangParser.WriteFileContext ctx) {
        this.options.setOutput(new FileOutput(ctx.FILE_NAME().getText()));
    }

    @Override
    public void enterSelectSome(CSVQueryLangParser.SelectSomeContext ctx) {
        this.options.getColumns().addAll(new ColumnsVisitor().visit(ctx.cols()));
    }

    @Override
    public void enterFilterSome(CSVQueryLangParser.FilterSomeContext ctx) {
        Expr expr = new ExpressionVisitor().visit(ctx.expr());
        this.options.setFilter(expr);
    }

    private static int columnNumber(CSVQueryLangParser.ColContext column){
        return Integer.valueOf(column.COL_DIGIT().getText())-1;
    }

    private static class ColumnsVisitor extends CSVQueryLangBaseVisitor<List<Integer>> {
        @Override
        public List<Integer> visitCols(CSVQueryLangParser.ColsContext ctx) {
            return ctx.col().stream().map(Listener::columnNumber).collect(Collectors.toList());
        }
    }

    private static class ExpressionVisitor extends CSVQueryLangBaseVisitor<Expr> {

        @Override
        public Expr visitExprEquals(CSVQueryLangParser.ExprEqualsContext ctx) {
            return new Equals(columnNumber(ctx.col()), ctx.STRING_CONST().getText());
        }

        @Override
        public Expr visitExprContains(CSVQueryLangParser.ExprContainsContext ctx) {
            return new Contains(columnNumber(ctx.col()), ctx.STRING_CONST().getText());
        }

        @Override
        public Expr visitExprAnd(CSVQueryLangParser.ExprAndContext ctx) {
            return new And(ctx.expr().stream().map(this::visit).collect(Collectors.toList()));
        }

        @Override
        public Expr visitExprOr(CSVQueryLangParser.ExprOrContext ctx) {
            return new Or(ctx.expr().stream().map(this::visit).collect(Collectors.toList()));
        }

        @Override
        public Expr visitExprNot(CSVQueryLangParser.ExprNotContext ctx) {
            return new Not(this.visit(ctx.expr()));
        }

        @Override
        public Expr visitExprNested(CSVQueryLangParser.ExprNestedContext ctx) {
            return this.visit(ctx.expr());
        }
    }

}