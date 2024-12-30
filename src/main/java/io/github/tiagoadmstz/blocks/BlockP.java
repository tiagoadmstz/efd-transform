package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.p.AberturaBlocoP;
import io.github.tiagoadmstz.blocks.p.AjusteContribPrevApSobreReceitaBruta;
import io.github.tiagoadmstz.blocks.p.CompEscrDetApuracaoContribuicao;
import io.github.tiagoadmstz.blocks.p.CompEscrDetApuracaoContribuicaoProcRef;
import io.github.tiagoadmstz.blocks.p.ConsContribPrevSobreReceitaBruta;
import io.github.tiagoadmstz.blocks.p.ContribuicaoPrevidenciariaReceitaBruta;
import io.github.tiagoadmstz.blocks.p.EncerramentoBlocoP;
import io.github.tiagoadmstz.blocks.p.IdentificacaoEstabelecimento;
import io.github.tiagoadmstz.commons.AbstractEfdBlock;
import lombok.Data;

import java.util.ArrayList;
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
        blockParts.put("P010", new IdentificacaoEstabelecimento());
        blockParts.put("P100", new ArrayList<ContribuicaoPrevidenciariaReceitaBruta>());
        blockParts.put("P110", new ArrayList<CompEscrDetApuracaoContribuicao>());
        blockParts.put("P199", new ArrayList<CompEscrDetApuracaoContribuicaoProcRef>());
        blockParts.put("P200", new ArrayList<ConsContribPrevSobreReceitaBruta>());
        blockParts.put("P210", new ArrayList<AjusteContribPrevApSobreReceitaBruta>());
        blockParts.put("P990", new EncerramentoBlocoP());
    }

    @Override
    public void setBlock(List<String> lines) {
        setList("P100", lines, ContribuicaoPrevidenciariaReceitaBruta.class);
        setList("P110", lines, CompEscrDetApuracaoContribuicao.class);
        setList("P119", lines, CompEscrDetApuracaoContribuicaoProcRef.class);
        setList("P200", lines, ConsContribPrevSobreReceitaBruta.class);
        setList("P210", lines, AjusteContribPrevApSobreReceitaBruta.class);

        lines.stream().filter(s -> {
            String[] filter = {"|P001", "|P990"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
