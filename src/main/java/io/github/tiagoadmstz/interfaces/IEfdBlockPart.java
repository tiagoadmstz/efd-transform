package io.github.tiagoadmstz.interfaces;

import java.util.List;

public interface IEfdBlockPart {

    void setByLines(final List<String> lines);

    void setBySplitedLine(final String[] fields);

    String toTxtFormat();

    boolean isAllNull();

    boolean isAllNonNull();
}
