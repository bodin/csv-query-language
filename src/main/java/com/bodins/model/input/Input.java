package com.bodins.model.input;

import com.bodins.model.CSVProcessOptions;

public interface Input {
    String[][] read(CSVProcessOptions options) throws Exception;
}
