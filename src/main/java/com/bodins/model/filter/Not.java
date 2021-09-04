package com.bodins.model.filter;

import java.util.List;

public class Not implements Expr {
    private final Expr expr;

    public Not(Expr expr) {
        this.expr = expr;
    }

    @Override
    public boolean eval(String[] row) {
        return !this.expr.eval(row);
    }
}
