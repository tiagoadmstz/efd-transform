package io.github.tiagoadmstz.interfaces;

public interface IEfdBlockPart {

    void setBySplitedLine(final String[] fields);

    String toTxtFormat();

    boolean isAllNull();

    boolean isAllNonNull();
}
