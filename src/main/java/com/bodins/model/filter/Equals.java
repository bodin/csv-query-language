package com.bodins.model.filter;

public class Equals implements Expr {
    private final int column;
    private final String value;

    public Equals(int column, String value) {
        this.column = column;
        this.value = value.substring(1, value.length()-1);
    }

    @Override
    public boolean eval(String[] row) {
        if(column >= row.length) return false;
        return this.value.equals(row[column]);
    }
}
