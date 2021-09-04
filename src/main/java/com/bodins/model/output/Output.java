package com.bodins.model.output;

import com.bodins.model.CSVProcessOptions;

public interface Output {
    void write(CSVProcessOptions options, String[][] content) throws Exception;

    default SelectedColumn[] selectRow(CSVProcessOptions options, String [] row) {
        if(options.isSelectAll()) {
            SelectedColumn[] result = new SelectedColumn[row.length];
            for(int col = 0; col < result.length; col++){
                result[col] = new SelectedColumn(col, row[col]);
            }
            return result;
        }

        SelectedColumn[] result = new SelectedColumn[options.getColumns().size()];
        for(int col = 0; col < result.length; col++){
            int original = options.getColumns().get(col);
            result[col] = new SelectedColumn(original, row[original]);
        }
        return result;
    }
}
