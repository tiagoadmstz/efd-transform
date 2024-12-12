package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.i.AberturaBlocoI;
import io.github.tiagoadmstz.blocks.i.EncerramentoBlocoI;
import io.github.tiagoadmstz.commons.AbstractEfdBlock;
import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import io.github.tiagoadmstz.interfaces.IEfdBlock;
import lombok.Data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Bloco I: Operações das Instituições Financeiras e Assemelhadas, Seguradoras, Entidades de Previdência Privada e Operadoras de Planos de Assistência à Saúde.
 */
@Data
public class BlockI extends AbstractEfdBlock {

    private final Map<String, Object> blockParts;

    public BlockI() {
        blockParts = HashMap.newHashMap(1);
        blockParts.put("I001", new AberturaBlocoI());
        blockParts.put("I990", new EncerramentoBlocoI());
    }

    @Override
    public void setBlock(List<String> lines) {
//        setList("D100", lines, NotaFiscal.class);

        lines.stream().filter(s -> {
            String[] filter = {"|I001", "|I990"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
