package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.one.AberturaBlocoOne;
import io.github.tiagoadmstz.blocks.one.ApuracaoCredExtemporaneoDocOpPis;
import io.github.tiagoadmstz.blocks.one.ApuracaoCrediExtempDocOpCofins;
import io.github.tiagoadmstz.blocks.one.ConsDocEmitidosPjSubRegTribLucroPresumido;
import io.github.tiagoadmstz.blocks.one.ContribuicaoSocialExtemporaneaCofins;
import io.github.tiagoadmstz.blocks.one.ContribuicaoSocialExtemporaneaPisPasep;
import io.github.tiagoadmstz.blocks.one.ControleCreditosFiscaisCofins;
import io.github.tiagoadmstz.blocks.one.ControleCreditosFiscaisPisPasep;
import io.github.tiagoadmstz.blocks.one.ControleValoresRetidosFonteCofins;
import io.github.tiagoadmstz.blocks.one.ControleValoresRetidosFontePisPasep;
import io.github.tiagoadmstz.blocks.one.DemCredDescontarContribExtempPisPasep;
import io.github.tiagoadmstz.blocks.one.DemoCredDescontarContribExtempCofins;
import io.github.tiagoadmstz.blocks.one.DetAjustesBaseCalcMensalPisCofins;
import io.github.tiagoadmstz.blocks.one.DetContribuicaoSocialExtemporaneaCofins;
import io.github.tiagoadmstz.blocks.one.DetCredExtempVincTipoReceitaCofins;
import io.github.tiagoadmstz.blocks.one.DetCrediExtempVinculadoTipoReceitaPis;
import io.github.tiagoadmstz.blocks.one.DetalhamentoContribSocialExtempPisPasep;
import io.github.tiagoadmstz.blocks.one.DetalhamentoContribuicoesExibSuspensa;
import io.github.tiagoadmstz.blocks.one.EncerramentoBlocoOne;
import io.github.tiagoadmstz.blocks.one.IncorporacaoImobiliariaRet;
import io.github.tiagoadmstz.blocks.one.IncorporacaoImobiliariaRetProcRef;
import io.github.tiagoadmstz.blocks.one.ProcessoReferenciadoAcaoJudicial;
import io.github.tiagoadmstz.blocks.one.ProcessoReferenciadoProcessoAdministrativo;
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
        blockParts.put("1010", new ProcessoReferenciadoAcaoJudicial());
        blockParts.put("1011", new ArrayList<DetalhamentoContribuicoesExibSuspensa>());
        blockParts.put("1020", new ArrayList<ProcessoReferenciadoProcessoAdministrativo>());
        blockParts.put("1050", new ArrayList<DetAjustesBaseCalcMensalPisCofins>());
        blockParts.put("1100", new ArrayList<ControleCreditosFiscaisPisPasep>());
        blockParts.put("1101", new ArrayList<ApuracaoCredExtemporaneoDocOpPis>());
        blockParts.put("1102", new DetCrediExtempVinculadoTipoReceitaPis());
        blockParts.put("1200", new ArrayList<ContribuicaoSocialExtemporaneaPisPasep>());
        blockParts.put("1210", new ArrayList<DetalhamentoContribSocialExtempPisPasep>());
        blockParts.put("1220", new ArrayList<DemCredDescontarContribExtempPisPasep>());
        blockParts.put("1300", new ArrayList<ControleValoresRetidosFontePisPasep>());
        blockParts.put("1500", new ArrayList<ControleCreditosFiscaisCofins>());
        blockParts.put("1501", new ArrayList<ApuracaoCrediExtempDocOpCofins>());
        blockParts.put("1502", new DetCredExtempVincTipoReceitaCofins());
        blockParts.put("1600", new ArrayList<ContribuicaoSocialExtemporaneaCofins>());
        blockParts.put("1610", new ArrayList<DetContribuicaoSocialExtemporaneaCofins>());
        blockParts.put("1620", new ArrayList<DemoCredDescontarContribExtempCofins>());
        blockParts.put("1700", new ArrayList<ControleValoresRetidosFonteCofins>());
        blockParts.put("1800", new ArrayList<IncorporacaoImobiliariaRet>());
        blockParts.put("1809", new ArrayList<IncorporacaoImobiliariaRetProcRef>());
        blockParts.put("1900", new ArrayList<ConsDocEmitidosPjSubRegTribLucroPresumido>());
        blockParts.put("1990", new EncerramentoBlocoOne());
    }

    @Override
    public void setBlock(List<String> lines) {
        setList("1011", lines, DetalhamentoContribuicoesExibSuspensa.class);
        setList("1020", lines, ProcessoReferenciadoProcessoAdministrativo.class);
        setList("1050", lines, DetAjustesBaseCalcMensalPisCofins.class);
        setList("1100", lines, ControleCreditosFiscaisPisPasep.class);
        setList("1101", lines, ApuracaoCredExtemporaneoDocOpPis.class);
        setList("1102", lines, DetCrediExtempVinculadoTipoReceitaPis.class);
        setList("1200", lines, ContribuicaoSocialExtemporaneaPisPasep.class);
        setList("1210", lines, DetalhamentoContribSocialExtempPisPasep.class);
        setList("1220", lines, DemCredDescontarContribExtempPisPasep.class);
        setList("1300", lines, ControleValoresRetidosFontePisPasep.class);
        setList("1500", lines, ControleCreditosFiscaisCofins.class);
        setList("1501", lines, ApuracaoCrediExtempDocOpCofins.class);
        setList("1600", lines, ContribuicaoSocialExtemporaneaCofins.class);
        setList("1610", lines, DetContribuicaoSocialExtemporaneaCofins.class);
        setList("1620", lines, DemoCredDescontarContribExtempCofins.class);
        setList("1700", lines, ControleValoresRetidosFonteCofins.class);
        setList("1800", lines, IncorporacaoImobiliariaRet.class);
        setList("1809", lines, IncorporacaoImobiliariaRetProcRef.class);
        setList("1900", lines, ConsDocEmitidosPjSubRegTribLucroPresumido.class);

        lines.stream().filter(s -> {
            String[] filter = {"|1001", "|1102", "|1502", "|1990"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
