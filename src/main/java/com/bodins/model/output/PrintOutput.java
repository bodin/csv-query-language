package com.bodins.model.output;

import com.bodins.model.CSVProcessOptions;

public class PrintOutput implements Output{
    @Override
    public void write(CSVProcessOptions options, String[][] content) {

        if(content.length == 0) return;

        //HACK - making an assumption the content is 'square'
        //SLOW - we are calculating the widths of all columns, regardless of which are selected
        int [] widths = new int[content[0].length];
        for(int row = 0; row < content.length; row++){
            for(int col = 0; col < content[row].length; col++) {
                widths[col] = Math.max(widths[col], length(content[row][col]));
            }
        }


        for(int row = 0; row < content.length; row++) {
            //grab only the columns that we want, in the order we want them
            SelectedColumn[] selected = this.selectRow(options, content[row]);

            for (int col = 0; col < selected.length; col++) {
                //grab the width based on the original calculations above (need the original placement)
                int width = widths[selected[col].originalColumn()];

                //pad the value out
                String value = String.format("%1$" + width+ "s", selected[col].text());

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
