package com.bodins.model;

import java.util.ArrayList;
import java.util.List;

public class CSVProcessOptions {
    private String fileName;
    private List<Integer> columns = new ArrayList<>();

    private Output output = new PrintOutput();

    public boolean isSelectAll(){
        return this.columns.isEmpty();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<Integer> getColumns() {
        return columns;
    }

    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }
}
