package com.bodins.model;

import com.bodins.antlr.CSVQueryLangLexer;
import com.bodins.antlr.CSVQueryLangParser;
import com.opencsv.CSVReader;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {

    public void execute(String statement) throws Exception{
        CSVProcessOptions options = this.parse(statement);

        if(options != null){
            this.process(options);
        }
    }
    public CSVProcessOptions parse(String s) {
        // setup the lexer with fail fast
        CSVQueryLangLexer lexer = new CSVQueryLangLexer(CharStreams.fromString(s));
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // setup the parser with fail fast
        CSVQueryLangParser parser = new CSVQueryLangParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        // parse
        CSVQueryLangParser.RootContext context = parser.root();

        // work over the AST
        ParseTreeWalker walker = new ParseTreeWalker();
        Listener listener = new Listener();
        walker.walk(listener, context);
        return listener.getOptions();
    }

    public void process(CSVProcessOptions options) throws Exception {
        String[][] content = options.getInput().read(options);
        List<SelectedColumn[]> selected = this.select(options, content);
        options.getOutput().write(options, selected);
    }

    private List<SelectedColumn[]> select(CSVProcessOptions options, String [][] content) {
        List<SelectedColumn[]> result = new ArrayList<>();
        for(String [] row : content) {
            if (options.isSelectAll()) {
                SelectedColumn[] selected = new SelectedColumn[row.length];
                for (int col = 0; col < selected.length; col++) {
                    selected[col] = new SelectedColumn(col, row[col]);
                }
                result.add(selected);
            }else {
                SelectedColumn[] selected = new SelectedColumn[options.getColumns().size()];
                for (int col = 0; col < selected.length; col++) {
                    int original = options.getColumns().get(col);
                    if(original < row.length) {
                        selected[col] = new SelectedColumn(original, row[original]);
                    }else{
                        selected[col] = new SelectedColumn(original, null);
                    }
                }
                result.add(selected);
            }
        }
        return result;
    }

    private static class ThrowingErrorListener extends BaseErrorListener {

        public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
        }
    }
}
