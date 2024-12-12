package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.p.AberturaBlocoP;
import io.github.tiagoadmstz.blocks.p.EncerramentoBlocoP;
import io.github.tiagoadmstz.commons.AbstractEfdBlock;
import lombok.Data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Bloco P: Apuração da Contribuição Previdenciária sobre a Receita Bruta (Fatos Geradores a partir de Março de 2012).
 */
@Data
public class BlockP extends AbstractEfdBlock {

    private final Map<String, Object> blockParts;

    public BlockP() {
        blockParts = HashMap.newHashMap(1);
        blockParts.put("P001", new AberturaBlocoP());
        blockParts.put("P990", new EncerramentoBlocoP());
    }

    @Override
    public void setBlock(List<String> lines) {
//        setList("D100", lines, NotaFiscal.class);

        lines.stream().filter(s -> {
            String[] filter = {"|P001", "|P990"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
