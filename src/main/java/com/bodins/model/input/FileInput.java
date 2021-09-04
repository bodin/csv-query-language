package com.bodins.model.input;

import com.bodins.model.CSVProcessOptions;
import com.opencsv.CSVReader;

import java.io.FileReader;

public class FileInput implements Input{
    private final String fileName;

    public FileInput(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String[][] read(CSVProcessOptions options) throws Exception{
        try (CSVReader csv = new CSVReader(new FileReader(this.fileName))) {
            return csv.readAll().toArray(new String[0][]);
        }
    }
}
