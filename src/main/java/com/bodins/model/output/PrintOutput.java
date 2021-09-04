package com.bodins.model.output;

import com.bodins.model.CSVProcessOptions;
import com.bodins.model.SelectedColumn;

import java.util.ArrayList;
import java.util.List;

public class PrintOutput implements Output{
    @Override
    public void write(CSVProcessOptions options, List<SelectedColumn[]> content) {

        if(content.size() == 0) return;

        List<Integer> widths = new ArrayList<>();
        for(SelectedColumn[] row : content){
            for(int col = 0; col < row.length; col++) {
                if(col < widths.size()){
                    widths.set(col, Math.max(widths.get(col), length(row[col].text())));
                } else{
                    widths.add(length(row[col].text()));
                }
            }
        }


        for(SelectedColumn[] row : content){
            for (int col = 0; col < row.length; col++) {
                int width = widths.get(col);

                //pad the value out
                String value = String.format("%1$" + width+ "s", row[col].text());

                //add our seperator
                if(col > 0) value = " | " + value;

                //print
                System.out.print(value);
            }
            //done with the row, print a newline
            System.out.println();
        }
    }
    private int length(String s){
        if (s == null) return 0;
        return s.length();
    }
}
