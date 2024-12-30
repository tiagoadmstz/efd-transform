package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.m.AberturaBlocoM;
import io.github.tiagoadmstz.blocks.m.EncerramentoBlocoM;
import io.github.tiagoadmstz.commons.AbstractEfdBlock;
import lombok.Data;

import java.util.ArrayList;
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
        blockParts.put("M100", new AberturaBlocoM());
        blockParts.put("M105", new ArrayList<>());
        blockParts.put("M110", new ArrayList<>());
        blockParts.put("M115", new ArrayList<>());
        blockParts.put("M200", new ArrayList<>());
        blockParts.put("M205", new ArrayList<>());
        blockParts.put("M210", new ArrayList<>());
        blockParts.put("M211", new ArrayList<>());
        blockParts.put("M215", new ArrayList<>());
        blockParts.put("M220", new ArrayList<>());
        blockParts.put("M225", new ArrayList<>());
        blockParts.put("M230", new ArrayList<>());
        blockParts.put("M300", new ArrayList<>());
        blockParts.put("M350", new ArrayList<>());
        blockParts.put("M400", new ArrayList<>());
        blockParts.put("M410", new ArrayList<>());
        blockParts.put("M500", new ArrayList<>());
        blockParts.put("M505", new ArrayList<>());
        blockParts.put("M510", new ArrayList<>());
        blockParts.put("M515", new ArrayList<>());
        blockParts.put("M600", new ArrayList<>());
        blockParts.put("M605", new ArrayList<>());
        blockParts.put("M610", new ArrayList<>());
        blockParts.put("M611", new ArrayList<>());
        blockParts.put("M615", new ArrayList<>());
        blockParts.put("M620", new ArrayList<>());
        blockParts.put("M625", new ArrayList<>());
        blockParts.put("M630", new ArrayList<>());
        blockParts.put("M700", new ArrayList<>());
        blockParts.put("M800", new ArrayList<>());
        blockParts.put("M810", new ArrayList<>());
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
