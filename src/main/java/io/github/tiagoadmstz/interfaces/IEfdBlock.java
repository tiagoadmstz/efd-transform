package io.github.tiagoadmstz.interfaces;

import java.util.List;

public interface IEfdBlock {

    void setBlock(List<String> lines);

    void setList(final String blockIndex, List<String> lines, Class<? extends IEfdBlockPart> blockPartType);

    void setBySplitedLine(final String[] fields);

    String toTxtFormat();
}
