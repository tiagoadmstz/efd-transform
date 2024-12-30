package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.f.AberturaBlocoF;
import io.github.tiagoadmstz.blocks.f.ApContribAliquotaReaisPorcRef;
import io.github.tiagoadmstz.blocks.f.ApContribUnidMedidaProdutoAliquotaReais;
import io.github.tiagoadmstz.blocks.f.BaseLucroPresIncPisCofinsRegCompet;
import io.github.tiagoadmstz.blocks.f.BaseLucroPresIncPisCofinsRegCompetPorcRef;
import io.github.tiagoadmstz.blocks.f.BensIncorporadosAtivoImobValorAquisicao;
import io.github.tiagoadmstz.blocks.f.BensIncorporadosAtivoImobilizado;
import io.github.tiagoadmstz.blocks.f.ConsOpPjSubTribBasePresIncPisCofins;
import io.github.tiagoadmstz.blocks.f.ConsOpPjSubTribBasePresIncPisCofinsProcRef;
import io.github.tiagoadmstz.blocks.f.ContribuicaoRetidaFonte;
import io.github.tiagoadmstz.blocks.f.CredDecEventosIncorporacaoFusaoCisao;
import io.github.tiagoadmstz.blocks.f.CreditoPresumidoEstoqueAbertura;
import io.github.tiagoadmstz.blocks.f.DeducoesDiversas;
import io.github.tiagoadmstz.blocks.f.DetalhamentoReceitaRecebidaRegimeCaixa;
import io.github.tiagoadmstz.blocks.f.DocOpGeradorasContrCred;
import io.github.tiagoadmstz.blocks.f.EncerramentoBlocoF;
import io.github.tiagoadmstz.blocks.f.IdentificacaoEstabelecimento;
import io.github.tiagoadmstz.blocks.f.IncidPisCofinsRegimeCaixa;
import io.github.tiagoadmstz.blocks.f.IncidPisCofinsRegimeCaixaPorcRef;
import io.github.tiagoadmstz.blocks.f.OpAtividadeImobCustoIncorridoUnidImob;
import io.github.tiagoadmstz.blocks.f.OpAtividadeImobCustoOrcUnidImobVendida;
import io.github.tiagoadmstz.blocks.f.OpAtividadeImobUnidadeImobVendida;
import io.github.tiagoadmstz.blocks.f.ProcRefCustoOrcUnidImobVendida;
import io.github.tiagoadmstz.blocks.f.ProcessoRefAtivoImobValorAquisicao;
import io.github.tiagoadmstz.blocks.f.ProcessoReferenciado;
import io.github.tiagoadmstz.blocks.f.ProcessoReferenciadoAtivoImob;
import io.github.tiagoadmstz.commons.AbstractEfdBlock;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Bloco F: Demais Documentos e Operações.
 */
@Data
public class BlockF extends AbstractEfdBlock {

    private final Map<String, Object> blockParts;

    public BlockF() {
        blockParts = HashMap.newHashMap(1);
        blockParts.put("F001", new AberturaBlocoF());
        blockParts.put("F010", new IdentificacaoEstabelecimento());
        blockParts.put("F100", new ArrayList<DocOpGeradorasContrCred>(1));
        blockParts.put("F111", new ArrayList<ProcessoReferenciado>(1));
        blockParts.put("F120", new ArrayList<BensIncorporadosAtivoImobilizado>(1));
        blockParts.put("F129", new ArrayList<ProcessoReferenciadoAtivoImob>(1));
        blockParts.put("F130", new ArrayList<BensIncorporadosAtivoImobValorAquisicao>(1));
        blockParts.put("F139", new ArrayList<ProcessoRefAtivoImobValorAquisicao>(1));
        blockParts.put("F150", new ArrayList<CreditoPresumidoEstoqueAbertura>(1));
        blockParts.put("F200", new ArrayList<OpAtividadeImobUnidadeImobVendida>(1));
        blockParts.put("F205", new OpAtividadeImobCustoIncorridoUnidImob());
        blockParts.put("F210", new ArrayList<OpAtividadeImobCustoOrcUnidImobVendida>(1));
        blockParts.put("F211", new ArrayList<ProcRefCustoOrcUnidImobVendida>(1));
        blockParts.put("F500", new ArrayList<IncidPisCofinsRegimeCaixa>(1));
        blockParts.put("F509", new ArrayList<IncidPisCofinsRegimeCaixaPorcRef>(1));
        blockParts.put("F510", new ArrayList<ApContribUnidMedidaProdutoAliquotaReais>(1));
        blockParts.put("F519", new ArrayList<ApContribAliquotaReaisPorcRef>(1));
        blockParts.put("F525", new ArrayList<DetalhamentoReceitaRecebidaRegimeCaixa>(1));
        blockParts.put("F550", new ArrayList<BaseLucroPresIncPisCofinsRegCompet>(1));
        blockParts.put("F559", new ArrayList<BaseLucroPresIncPisCofinsRegCompetPorcRef>(1));
        blockParts.put("F560", new ArrayList<ConsOpPjSubTribBasePresIncPisCofins>(1));
        blockParts.put("F569", new ArrayList<ConsOpPjSubTribBasePresIncPisCofinsProcRef>(1));
        blockParts.put("F600", new ArrayList<ContribuicaoRetidaFonte>(1));
        blockParts.put("F700", new ArrayList<DeducoesDiversas>(1));
        blockParts.put("F800", new ArrayList<CredDecEventosIncorporacaoFusaoCisao>(1));
        blockParts.put("F990", new EncerramentoBlocoF());
    }

    @Override
    public void setBlock(List<String> lines) {
        setList("F100", lines, DocOpGeradorasContrCred.class);
        setList("F111", lines, ProcessoReferenciado.class);
        setList("F120", lines, BensIncorporadosAtivoImobilizado.class);
        setList("F129", lines, ProcessoReferenciadoAtivoImob.class);
        setList("F130", lines, BensIncorporadosAtivoImobValorAquisicao.class);
        setList("F139", lines, ProcessoRefAtivoImobValorAquisicao.class);
        setList("F150", lines, CreditoPresumidoEstoqueAbertura.class);
        setList("F200", lines, OpAtividadeImobUnidadeImobVendida.class);
        setList("F210", lines, OpAtividadeImobCustoOrcUnidImobVendida.class);
        setList("F211", lines, ProcRefCustoOrcUnidImobVendida.class);
        setList("F500", lines, IncidPisCofinsRegimeCaixa.class);
        setList("F509", lines, IncidPisCofinsRegimeCaixaPorcRef.class);
        setList("F510", lines, ApContribUnidMedidaProdutoAliquotaReais.class);
        setList("F519", lines, ApContribAliquotaReaisPorcRef.class);
        setList("F525", lines, DetalhamentoReceitaRecebidaRegimeCaixa.class);
        setList("F550", lines, BaseLucroPresIncPisCofinsRegCompet.class);
        setList("F559", lines, BaseLucroPresIncPisCofinsRegCompetPorcRef.class);
        setList("F560", lines, ConsOpPjSubTribBasePresIncPisCofins.class);
        setList("F569", lines, ConsOpPjSubTribBasePresIncPisCofinsProcRef.class);
        setList("F600", lines, ContribuicaoRetidaFonte.class);
        setList("F700", lines, DeducoesDiversas.class);
        setList("F800", lines, CredDecEventosIncorporacaoFusaoCisao.class);

        lines.stream().filter(s -> {
            String[] filter = {"|F001", "|F205", "|F990"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
