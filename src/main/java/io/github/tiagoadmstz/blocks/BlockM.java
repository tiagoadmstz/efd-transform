package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.m.AberturaBlocoM;
import io.github.tiagoadmstz.blocks.m.EncerramentoBlocoM;
import io.github.tiagoadmstz.commons.AbstractEfdBlock;
import lombok.Data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Bloco M: Apuração da Contribuição e Crédito de PIS/PASEP e da COFINS.
 */
@Data
public class BlockM extends AbstractEfdBlock {

    private final Map<String, Object> blockParts;

    public BlockM() {
        blockParts = HashMap.newHashMap(1);
        blockParts.put("M001", new AberturaBlocoM());
        blockParts.put("M990", new EncerramentoBlocoM());
    }

    @Override
    public void setBlock(List<String> lines) {
//        setList("D100", lines, NotaFiscal.class);

        lines.stream().filter(s -> {
            String[] filter = {"|M001", "|M990"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
