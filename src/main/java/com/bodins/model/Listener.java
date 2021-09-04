package com.bodins.model;

import com.bodins.antlr.CSVQueryLangBaseListener;
import com.bodins.antlr.CSVQueryLangParser;

public class Listener extends CSVQueryLangBaseListener {
    private final CSVProcessOptions options = new CSVProcessOptions();

    public CSVProcessOptions getOptions() {
        return options;
    }

    @Override
    public void enterRoot(CSVQueryLangParser.RootContext ctx) {
        this.options.setFileName(ctx.FILE().getText());
    }

    @Override
    public void enterCol(CSVQueryLangParser.ColContext ctx) {
        this.options.getColumns().add(Integer.valueOf(ctx.COL_DIGIT().getText())-1);
    }
}