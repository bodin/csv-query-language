package com.bodins.model.filter;

import java.util.List;

public class Or implements Expr {
    private final List<Expr> exprs;

    public Or(List<Expr> exprs) {
        this.exprs = exprs;
    }

    @Override
    public boolean eval(String[] row) {
        for(Expr e : this.exprs){
            if(e.eval(row)) return true;
        }
        return false;
    }
}
