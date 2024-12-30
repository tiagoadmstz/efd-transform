package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.i.AberturaBlocoI;
import io.github.tiagoadmstz.blocks.i.CompReceitasDeducoesExcPerProcRef;
import io.github.tiagoadmstz.blocks.i.CompReceitasDeducoesExclusoesPeriodo;
import io.github.tiagoadmstz.blocks.i.ComplOpDetReceitasDedExclPerProcRef;
import io.github.tiagoadmstz.blocks.i.ComplOpDetReceitasDeducoesExclPer;
import io.github.tiagoadmstz.blocks.i.ConsOperacoesPeriodoProcRef;
import io.github.tiagoadmstz.blocks.i.ConsolidacaoOperacoesPeriodo;
import io.github.tiagoadmstz.blocks.i.EncerramentoBlocoI;
import io.github.tiagoadmstz.blocks.i.IdentificacaoPessoaJuridica;
import io.github.tiagoadmstz.commons.AbstractEfdBlock;
import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import io.github.tiagoadmstz.interfaces.IEfdBlock;
import lombok.Data;

import java.util.ArrayList;
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
        blockParts.put("I010", new IdentificacaoPessoaJuridica());
        blockParts.put("I100", new ArrayList<ConsolidacaoOperacoesPeriodo>());
        blockParts.put("I199", new ArrayList<ConsOperacoesPeriodoProcRef>());
        blockParts.put("I200", new ArrayList<CompReceitasDeducoesExclusoesPeriodo>());
        blockParts.put("I299", new ArrayList<CompReceitasDeducoesExcPerProcRef>());
        blockParts.put("I300", new ArrayList<ComplOpDetReceitasDeducoesExclPer>());
        blockParts.put("I399", new ArrayList<ComplOpDetReceitasDedExclPerProcRef>());
        blockParts.put("I990", new EncerramentoBlocoI());
    }

    @Override
    public void setBlock(List<String> lines) {
        setList("I100", lines, ConsolidacaoOperacoesPeriodo.class);
        setList("I199", lines, ConsOperacoesPeriodoProcRef.class);
        setList("I200", lines, CompReceitasDeducoesExclusoesPeriodo.class);
        setList("I299", lines, CompReceitasDeducoesExcPerProcRef.class);
        setList("I300", lines, ComplOpDetReceitasDeducoesExclPer.class);
        setList("I399", lines, ComplOpDetReceitasDedExclPerProcRef.class);

        lines.stream().filter(s -> {
            String[] filter = {"|I001", "|I990"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
