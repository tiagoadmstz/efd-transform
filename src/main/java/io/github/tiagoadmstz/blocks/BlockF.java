package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.f.AberturaBlocoF;
import io.github.tiagoadmstz.blocks.f.EncerramentoBlocoF;
import io.github.tiagoadmstz.commons.AbstractEfdBlock;
import lombok.Data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Bloco F: Demais Documentos e Operações.
 */
@Data
public class BlockF extends AbstractEfdBlock {

    private final Map<String, Object> blockParts;

    public BlockF() {
        blockParts = HashMap.newHashMap(1);
        blockParts.put("F001", new AberturaBlocoF());
        blockParts.put("F990", new EncerramentoBlocoF());
    }

    @Override
    public void setBlock(List<String> lines) {
//        setList("D100", lines, NotaFiscal.class);

        lines.stream().filter(s -> {
            String[] filter = {"|F001", "|F990"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
