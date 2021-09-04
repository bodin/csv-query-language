package com.bodins.model.filter;

public interface Expr {
    boolean eval(String [] row);
}
