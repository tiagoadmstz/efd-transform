package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.one.AberturaBlocoOne;
import io.github.tiagoadmstz.blocks.one.EncerramentoBlocoOne;
import io.github.tiagoadmstz.commons.AbstractEfdBlock;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Bloco 1: Complemento da Escrituração – Controle de Saldos de Créditos e de Retenções, Operações Extemporâneas e Outras Informações.
 */
@Data
public class BlockOne extends AbstractEfdBlock {

    private final Map<String, Object> blockParts;

    public BlockOne() {
        blockParts = HashMap.newHashMap(1);
        blockParts.put("1001", new AberturaBlocoOne());
        blockParts.put("1010", new AberturaBlocoOne());
        blockParts.put("1011", new ArrayList<>());
        blockParts.put("1020", new ArrayList<>());
        blockParts.put("1100", new ArrayList<>());
        blockParts.put("1101", new ArrayList<>());
        blockParts.put("1102", new ArrayList<>());
        blockParts.put("1200", new ArrayList<>());
        blockParts.put("1210", new ArrayList<>());
        blockParts.put("1220", new ArrayList<>());
        blockParts.put("1300", new ArrayList<>());
        blockParts.put("1500", new ArrayList<>());
        blockParts.put("1501", new ArrayList<>());
        blockParts.put("1502", new ArrayList<>());
        blockParts.put("1600", new ArrayList<>());
        blockParts.put("1610", new ArrayList<>());
        blockParts.put("1620", new ArrayList<>());
        blockParts.put("1700", new ArrayList<>());
        blockParts.put("1800", new ArrayList<>());
        blockParts.put("1809", new ArrayList<>());
        blockParts.put("1900", new ArrayList<>());
        blockParts.put("1990", new EncerramentoBlocoOne());
    }

    @Override
    public void setBlock(List<String> lines) {
//        setList("D100", lines, NotaFiscal.class);

        lines.stream().filter(s -> {
            String[] filter = {"|1001", "|1990"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
