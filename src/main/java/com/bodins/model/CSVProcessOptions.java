package com.bodins.model;

import com.bodins.model.filter.Expr;
import com.bodins.model.input.Input;
import com.bodins.model.output.Output;

import java.util.ArrayList;
import java.util.List;

public class CSVProcessOptions {
    private Input input;
    private Output output;
    private Expr filter;
    private List<Integer> columns = new ArrayList<>();

    public boolean isSelectAll(){
        return this.columns.isEmpty();
    }

    public Input getInput() {
        return input;
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public Output getOutput() {
        return output;
    }

    public Expr getFilter() {
        return filter;
    }

    public void setFilter(Expr filter) {
        this.filter = filter;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public List<Integer> getColumns() {
        return columns;
    }
}
