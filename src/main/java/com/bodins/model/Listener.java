package com.bodins.model;

import com.bodins.antlr.CSVQueryLangBaseListener;
import com.bodins.antlr.CSVQueryLangParser;
import com.bodins.model.input.FileInput;
import com.bodins.model.output.FileOutput;
import com.bodins.model.output.PrintOutput;

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
    public void enterCol(CSVQueryLangParser.ColContext ctx) {
        this.options.getColumns().add(Integer.valueOf(ctx.COL_DIGIT().getText())-1);
    }
}