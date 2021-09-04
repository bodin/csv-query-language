package com.bodins.model.output;

import com.bodins.model.CSVProcessOptions;
import com.bodins.model.SelectedColumn;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

public class FileOutput implements Output{

    private final String fileName;

    public FileOutput(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(CSVProcessOptions options, List<SelectedColumn[]> content) throws Exception{
        try (CSVWriter csv = new CSVWriter(new FileWriter(this.fileName))) {
            for(SelectedColumn[] row : content) {
                String[] nextRow = Arrays.stream(row)
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
