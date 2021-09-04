package com.bodins.model;

public class SelectedColumn {
    private final int originalColumn;
    private final String text;

    public SelectedColumn(int originalColumn, String text) {
        this.originalColumn = originalColumn;
        this.text = text;
    }

    public int getOriginalColumn() {
        return originalColumn;
    }

    public String getText() {
        return text;
    }
}
