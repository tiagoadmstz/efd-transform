package io.github.tiagoadmstz;

import io.github.tiagoadmstz.blocks.BlockA;
import io.github.tiagoadmstz.blocks.BlockC;
import io.github.tiagoadmstz.blocks.BlockD;
import io.github.tiagoadmstz.blocks.BlockF;
import io.github.tiagoadmstz.blocks.BlockI;
import io.github.tiagoadmstz.blocks.BlockM;
import io.github.tiagoadmstz.blocks.BlockNine;
import io.github.tiagoadmstz.blocks.BlockOne;
import io.github.tiagoadmstz.blocks.BlockP;
import io.github.tiagoadmstz.blocks.BlockZero;
import io.github.tiagoadmstz.blocks.zero.AberturaArquivoDigital;
import io.github.tiagoadmstz.interfaces.IEfdBlock;
import jakarta.inject.Inject;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
public class EfdFile {

    private final BlockZero blockZero;
    private final BlockA blockA;
    private final BlockC blockC;
    private final BlockD blockD;
    private final BlockF blockF;
    private final BlockI blockI;
    private final BlockM blockM;
    private final BlockP blockP;
    private final BlockOne blockOne;
    private final BlockNine blockNine;

    private List<IEfdBlock> blocks;

    @Inject
    public EfdFile(
            BlockZero blockZero,
            BlockA blockA, BlockC blockC, BlockD blockD, BlockF blockF,
            BlockI blockI, BlockM blockM, BlockP blockP,
            BlockOne blockOne,
            BlockNine blockNine
    ) {
        this.blockZero = blockZero;
        this.blockA = blockA;
        this.blockC = blockC;
        this.blockD = blockD;
        this.blockF = blockF;
        this.blockI = blockI;
        this.blockM = blockM;
        this.blockP = blockP;
        this.blockOne = blockOne;
        this.blockNine = blockNine;
    }

    public void setEfdFile(final List<String> lines) {
        getBlocks().forEach(block -> block.setBlock(lines));
    }

    public String toString() {
        return getBlocks().stream()
                .map(IEfdBlock::toTxtFormat)
                .collect(Collectors.joining("\n"));
    }

    private List<IEfdBlock> getBlocks() {
        if (Objects.isNull(blocks)) {
            blocks = Arrays.asList(
                    blockZero,
                    blockA, blockC, blockD, blockF, blockI, blockM, blockP,
                    blockOne, blockNine
            );
        }
        return blocks;
    }
}
