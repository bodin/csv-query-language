package com.bodins.model.output;

import com.bodins.model.CSVProcessOptions;
import com.bodins.model.SelectedColumn;

import java.util.List;

public interface Output {
    void write(CSVProcessOptions options, List<SelectedColumn[]> content) throws Exception;
}
