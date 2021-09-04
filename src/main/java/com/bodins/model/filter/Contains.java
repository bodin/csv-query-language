package com.bodins.model.filter;

public class Contains implements Expr {
    private final int column;
    private final String value;

    public Contains(int column, String value) {
        this.column = column;
        this.value = value;
    }

    @Override
    public boolean eval(String[] row) {
        if(column >= row.length) return false;

        return this.value.contains(row[column]);
    }
}
