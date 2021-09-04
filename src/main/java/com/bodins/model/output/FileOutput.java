package com.bodins.model.output;

import com.bodins.model.CSVProcessOptions;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.util.Arrays;

public class FileOutput implements Output{

    private final String fileName;

    public FileOutput(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(CSVProcessOptions options, String[][] content) throws Exception{
        try (CSVWriter csv = new CSVWriter(new FileWriter(this.fileName))) {
            for(String[] row : content) {
                SelectedColumn[] selected = this.selectRow(options, row);
                String[] nextRow = Arrays.stream(selected)
                        .map(SelectedColumn::text)
                        .toArray(i -> new String[i]);
                csv.writeNext(nextRow);
            }
        }
    }
    private int length(String s){
        if (s == null) return 0;
        return s.length();
    }
}
