package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.d.AberturaBlocoD;
import io.github.tiagoadmstz.blocks.d.EncerramentoBlocoD;
import io.github.tiagoadmstz.commons.AbstractEfdBlock;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Bloco D:Documentos Fiscais – II - Serviços (ICMS).
 */
@Data
public class BlockD extends AbstractEfdBlock {

    private final Map<String, Object> blockParts;

    public BlockD() {
        blockParts = HashMap.newHashMap(1);
        blockParts.put("D001", new AberturaBlocoD());
        blockParts.put("D010", new ArrayList<>(1));

        blockParts.put("D100", new ArrayList<>(1));
        blockParts.put("D101", new ArrayList<>(1));
        blockParts.put("D105", new ArrayList<>(1));
        blockParts.put("D111", new ArrayList<>(1));
        blockParts.put("D200", new ArrayList<>(1));
        blockParts.put("D201", new ArrayList<>(1));
        blockParts.put("D205", new ArrayList<>(1));
        blockParts.put("D209", new ArrayList<>(1));
        blockParts.put("D300", new ArrayList<>(1));
        blockParts.put("D309", new ArrayList<>(1));
        blockParts.put("D350", new ArrayList<>(1));
        blockParts.put("D359", new ArrayList<>(1));
        blockParts.put("D500", new ArrayList<>(1));
        blockParts.put("D501", new ArrayList<>(1));
        blockParts.put("D505", new ArrayList<>(1));

        blockParts.put("D509", new ArrayList<>(1));
        blockParts.put("D600", new ArrayList<>(1));
        blockParts.put("D601", new ArrayList<>(1));
        blockParts.put("D605", new ArrayList<>(1));
        blockParts.put("D609", new ArrayList<>(1));
        blockParts.put("D990", new EncerramentoBlocoD());
    }

    public void setBlock(List<String> lines) {
//        setList("D100", lines, NotaFiscal.class);
//        setList("D101", lines, InformacaoComplementarNF.class);
//        setList("D105", lines, ProcessoReferenciado.class);
//        setList("D111", lines, OperacoesImportacao.class);
//        setList("D200", lines, ItensDocumento.class);
//        setList("D201", lines, RegistroAnaliticoDocumento.class);
//        setList("D205", lines, RegistroAnaliticoDocumento.class);
//        setList("D209", lines, RegistroAnaliticoDocumento.class);
//        setList("D300", lines, RegistroAnaliticoDocumento.class);
//        setList("D309", lines, RegistroAnaliticoDocumento.class);
//        setList("D350", lines, RegistroAnaliticoDocumento.class);
//        setList("D359", lines, RegistroAnaliticoDocumento.class);
//        setList("D500", lines, RegistroAnaliticoDocumento.class);
//        setList("D501", lines, RegistroAnaliticoDocumento.class);
//        setList("D505", lines, RegistroAnaliticoDocumento.class);

        lines.stream().filter(s -> {
            String[] filter = {"|D001", "|D010", "|D509", "|D600", "|D601", "|D605", "|D609"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
