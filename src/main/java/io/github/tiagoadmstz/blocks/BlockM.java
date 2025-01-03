package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.m.AberturaBlocoM;
import io.github.tiagoadmstz.blocks.m.AjustesCalculoContribPisApurada;
import io.github.tiagoadmstz.blocks.m.AjustesCofinsApurada;
import io.github.tiagoadmstz.blocks.m.AjustesContribuicaoPisApurada;
import io.github.tiagoadmstz.blocks.m.AjustesCreditoCofinsApurado;
import io.github.tiagoadmstz.blocks.m.AjustesCreditoPisPasepApurado;
import io.github.tiagoadmstz.blocks.m.CofinsDiferidaValoresPagarPeriodo;
import io.github.tiagoadmstz.blocks.m.ConsContribSeguridadeSocialCofinsInfoAdic;
import io.github.tiagoadmstz.blocks.m.ConsContribSeguridadeSocialCofinsPeriodo;
import io.github.tiagoadmstz.blocks.m.ConsolidacaoContribuicaoPisPeriodo;
import io.github.tiagoadmstz.blocks.m.ContribuicaoPisDiferidaValoresPagar;
import io.github.tiagoadmstz.blocks.m.ContribuicaoPisRecolherVisaoDebitoDCTF;
import io.github.tiagoadmstz.blocks.m.ContribuicaoSeguridadeSocialCofinsRecolher;
import io.github.tiagoadmstz.blocks.m.CreditoCofinsRelativoPeriodo;
import io.github.tiagoadmstz.blocks.m.CreditoPisPasepRelativoPeriodo;
import io.github.tiagoadmstz.blocks.m.DetAjustesContribuicaoPisApurada;
import io.github.tiagoadmstz.blocks.m.DetBaseCalculoCredApuradoPisPasep;
import io.github.tiagoadmstz.blocks.m.DetalhAjustesCalculoMensalCofinsApurada;
import io.github.tiagoadmstz.blocks.m.DetalhContribSeguridadeSocialCofinsRecolher;
import io.github.tiagoadmstz.blocks.m.DetalhamBaseCalculoCreditoCofins;
import io.github.tiagoadmstz.blocks.m.DetalhamReceitasIsentasAliquotaZeroCofins;
import io.github.tiagoadmstz.blocks.m.DetalhamReceitasIsentasContribZeroPis;
import io.github.tiagoadmstz.blocks.m.DetalhamentoAjustesCofinsApurada;
import io.github.tiagoadmstz.blocks.m.DetalhamentoAjustesCreditoCofinsApurado;
import io.github.tiagoadmstz.blocks.m.DetalhamentoAjustesCreditoPisApurado;
import io.github.tiagoadmstz.blocks.m.DetalhamentoContribPisPeriodo;
import io.github.tiagoadmstz.blocks.m.EncerramentoBlocoM;
import io.github.tiagoadmstz.blocks.m.InformacoesAdicionaisDiferimento;
import io.github.tiagoadmstz.blocks.m.PisPasepFolhaSalarios;
import io.github.tiagoadmstz.blocks.m.ReceitasIsentasAliquotaZeroCofins;
import io.github.tiagoadmstz.blocks.m.ReceitasIsentasContribZeroPis;
import io.github.tiagoadmstz.blocks.m.SociedadesCooperativasCompCalculoCofins;
import io.github.tiagoadmstz.blocks.m.SociedadesCooperativasCompCalculoPis;
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
        blockParts.put("M100", new ArrayList<CreditoPisPasepRelativoPeriodo>());
        blockParts.put("M105", new ArrayList<DetBaseCalculoCredApuradoPisPasep>());
        blockParts.put("M110", new ArrayList<AjustesCreditoPisPasepApurado>());
        blockParts.put("M115", new ArrayList<DetalhamentoAjustesCreditoPisApurado>());
        blockParts.put("M200", new ConsolidacaoContribuicaoPisPeriodo());
        blockParts.put("M205", new ArrayList<ContribuicaoPisRecolherVisaoDebitoDCTF>());
        blockParts.put("M210", new ArrayList<DetalhamentoContribPisPeriodo>());
        blockParts.put("M211", new SociedadesCooperativasCompCalculoPis());
        blockParts.put("M215", new ArrayList<AjustesCalculoContribPisApurada>());
        blockParts.put("M220", new ArrayList<AjustesContribuicaoPisApurada>());
        blockParts.put("M225", new ArrayList<DetAjustesContribuicaoPisApurada>());
        blockParts.put("M230", new ArrayList<InformacoesAdicionaisDiferimento>());
        blockParts.put("M300", new ArrayList<ContribuicaoPisDiferidaValoresPagar>());
        blockParts.put("M350", new PisPasepFolhaSalarios());
        blockParts.put("M400", new ArrayList<ReceitasIsentasContribZeroPis>());
        blockParts.put("M410", new ArrayList<DetalhamReceitasIsentasContribZeroPis>());
        blockParts.put("M500", new ArrayList<CreditoCofinsRelativoPeriodo>());
        blockParts.put("M505", new ArrayList<DetalhamBaseCalculoCreditoCofins>());
        blockParts.put("M510", new ArrayList<AjustesCreditoCofinsApurado>());
        blockParts.put("M515", new ArrayList<DetalhamentoAjustesCreditoCofinsApurado>());
        blockParts.put("M600", new ConsContribSeguridadeSocialCofinsPeriodo());
        blockParts.put("M605", new ArrayList<ContribuicaoSeguridadeSocialCofinsRecolher>());
        blockParts.put("M610", new ArrayList<DetalhContribSeguridadeSocialCofinsRecolher>());
        blockParts.put("M611", new SociedadesCooperativasCompCalculoCofins());
        blockParts.put("M615", new ArrayList<DetalhAjustesCalculoMensalCofinsApurada>());
        blockParts.put("M620", new ArrayList<AjustesCofinsApurada>());
        blockParts.put("M625", new ArrayList<DetalhamentoAjustesCofinsApurada>());
        blockParts.put("M630", new ArrayList<ConsContribSeguridadeSocialCofinsInfoAdic>());
        blockParts.put("M700", new ArrayList<CofinsDiferidaValoresPagarPeriodo>());
        blockParts.put("M800", new ArrayList<ReceitasIsentasAliquotaZeroCofins>());
        blockParts.put("M810", new ArrayList<DetalhamReceitasIsentasAliquotaZeroCofins>());
        blockParts.put("M990", new EncerramentoBlocoM());
    }

    @Override
    public void setBlock(List<String> lines) {
        setList("M100", lines, CreditoPisPasepRelativoPeriodo.class);
        setList("M105", lines, DetBaseCalculoCredApuradoPisPasep.class);
        setList("M110", lines, AjustesCreditoPisPasepApurado.class);
        setList("M115", lines, DetalhamentoAjustesCreditoPisApurado.class);
        setList("M205", lines, ContribuicaoPisRecolherVisaoDebitoDCTF.class);
        setList("M215", lines, AjustesCalculoContribPisApurada.class);
        setList("M220", lines, AjustesContribuicaoPisApurada.class);
        setList("M225", lines, DetAjustesContribuicaoPisApurada.class);
        setList("M230", lines, InformacoesAdicionaisDiferimento.class);
        setList("M300", lines, ContribuicaoPisDiferidaValoresPagar.class);
        setList("M400", lines, ReceitasIsentasContribZeroPis.class);
        setList("M410", lines, DetalhamReceitasIsentasContribZeroPis.class);
        setList("M500", lines, CreditoCofinsRelativoPeriodo.class);
        setList("M505", lines, DetalhamBaseCalculoCreditoCofins.class);
        setList("M510", lines, AjustesCreditoCofinsApurado.class);
        setList("M515", lines, DetalhamentoAjustesCreditoCofinsApurado.class);
        setList("M605", lines, ContribuicaoSeguridadeSocialCofinsRecolher.class);
        setList("M610", lines, DetalhContribSeguridadeSocialCofinsRecolher.class);
        setList("M615", lines, DetalhAjustesCalculoMensalCofinsApurada.class);
        setList("M620", lines, AjustesCofinsApurada.class);
        setList("M625", lines, DetalhamentoAjustesCofinsApurada.class);
        setList("M630", lines, ConsContribSeguridadeSocialCofinsInfoAdic.class);
        setList("M700", lines, CofinsDiferidaValoresPagarPeriodo.class);
        setList("M800", lines, ReceitasIsentasAliquotaZeroCofins.class);
        setList("M810", lines, DetalhamReceitasIsentasAliquotaZeroCofins.class);

        lines.stream().filter(s -> {
            String[] filter = {"|M001", "|M200", "|M211", "|M350", "|M600", "|M611", "|M990"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
