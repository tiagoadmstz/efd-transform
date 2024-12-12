package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.nine.AberturaBlocoNine;
import io.github.tiagoadmstz.blocks.nine.EncerramentoArquivoDigital;
import io.github.tiagoadmstz.blocks.nine.EncerramentoBlocoNine;
import io.github.tiagoadmstz.blocks.nine.RegistrosArquivo;
import io.github.tiagoadmstz.commons.AbstractEfdBlock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Bloco 9: Controle e Encerramento do Arquivo Digital.
 */
public class BlockNine extends AbstractEfdBlock {

    private final Map<String, Object> blockParts;

    public BlockNine() {
        blockParts = HashMap.newHashMap(1);
        blockParts.put("9001", new AberturaBlocoNine());
        blockParts.put("9900", new ArrayList<RegistrosArquivo>(1));
        blockParts.put("9990", new EncerramentoBlocoNine());
        blockParts.put("9999", new EncerramentoArquivoDigital());
    }

    @Override
    public void setBlock(List<String> lines) {
        setList("9900", lines, RegistrosArquivo.class);

        lines.stream().filter(s -> {
            String[] filter = {"|9001", "|9990", "9999"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
