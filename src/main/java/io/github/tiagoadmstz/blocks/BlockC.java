package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.c.AberturaBlocoC;
import io.github.tiagoadmstz.blocks.c.ComplementoOperacaoPisPasep;
import io.github.tiagoadmstz.blocks.c.ConsolidacaoDocEmitidosEcf;
import io.github.tiagoadmstz.blocks.c.ConsolidacaoDocEmitidosEcfCofins;
import io.github.tiagoadmstz.blocks.c.ConsolidacaoDocEmitidosEcfPis;
import io.github.tiagoadmstz.blocks.c.ConsolidacaoNfeEmitidasPj;
import io.github.tiagoadmstz.blocks.c.DetalhamentoConsolidacaoCofins;
import io.github.tiagoadmstz.blocks.c.DetalhamentoConsolidacaoPisPasep;
import io.github.tiagoadmstz.blocks.c.DetalhamentoConsolidacaoProcRef;
import io.github.tiagoadmstz.blocks.c.EncerramentoBlocoC;
import io.github.tiagoadmstz.blocks.c.EquiapmentoEcf;
import io.github.tiagoadmstz.blocks.c.IdentificacaoEstabelecimentoC;
import io.github.tiagoadmstz.blocks.c.InformacaoComplementarNF;
import io.github.tiagoadmstz.blocks.c.ItensDocumento;
import io.github.tiagoadmstz.blocks.c.ItensDocumentoEntradaCredito;
import io.github.tiagoadmstz.blocks.c.NotaFiscal;
import io.github.tiagoadmstz.blocks.c.NotaFiscalConsumo;
import io.github.tiagoadmstz.blocks.c.NotaVendaConsumidor;
import io.github.tiagoadmstz.blocks.c.NotaVendaConsumidorEntradasCredito;
import io.github.tiagoadmstz.blocks.c.OperacaoAquisicaoCofins;
import io.github.tiagoadmstz.blocks.c.OperacaoAquisicaoPisPasep;
import io.github.tiagoadmstz.blocks.c.OperacaoAquisicaoProcReferenciado;
import io.github.tiagoadmstz.blocks.c.OperacaoImportacaoCompl;
import io.github.tiagoadmstz.blocks.c.OperacaoVendasCofins;
import io.github.tiagoadmstz.blocks.c.OperacaoVendasPisPasep;
import io.github.tiagoadmstz.blocks.c.OperacaoVendasProcReferenciado;
import io.github.tiagoadmstz.blocks.c.OperacoesAquisicao;
import io.github.tiagoadmstz.blocks.c.OperacoesImportacao;
import io.github.tiagoadmstz.blocks.c.ProcessoReferenciado;
import io.github.tiagoadmstz.blocks.c.ReducaoZ;
import io.github.tiagoadmstz.blocks.c.RegistroAnaliticoDocumento;
import io.github.tiagoadmstz.blocks.c.ResumoDiarioCofins;
import io.github.tiagoadmstz.blocks.c.ResumoDiarioPis;
import io.github.tiagoadmstz.blocks.c.ResumoDiarioProcReferenciado;
import io.github.tiagoadmstz.commons.AbstractEfdBlock;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Bloco C: Documentos Fiscais – I - Mercadorias (ICMS/IPI).
 */
@Data
public class BlockC extends AbstractEfdBlock {

    private final Map<String, Object> blockParts;

    public BlockC() {
        blockParts = HashMap.newHashMap(1);
        blockParts.put("C001", new AberturaBlocoC());
        blockParts.put("C010", new ArrayList<IdentificacaoEstabelecimentoC>(1));
        blockParts.put("C100", new ArrayList<NotaFiscal>(1));
        blockParts.put("C110", new ArrayList<InformacaoComplementarNF>(1));
        blockParts.put("C111", new ArrayList<ProcessoReferenciado>(1));
        blockParts.put("C120", new ArrayList<OperacoesImportacao>(1));
        blockParts.put("C170", new ArrayList<ItensDocumento>(1));
        blockParts.put("C175", new ArrayList<RegistroAnaliticoDocumento>(1));
        blockParts.put("C180", new ArrayList<ConsolidacaoNfeEmitidasPj>(1));
        blockParts.put("C181", new ArrayList<OperacaoVendasPisPasep>(1));
        blockParts.put("C185", new ArrayList<OperacaoVendasCofins>(1));
        blockParts.put("C188", new ArrayList<OperacaoVendasProcReferenciado>(1));
        blockParts.put("C190", new ArrayList<OperacoesAquisicao>(1));
        blockParts.put("C191", new ArrayList<OperacaoAquisicaoPisPasep>(1));
        blockParts.put("C195", new ArrayList<OperacaoAquisicaoCofins>(1));
        blockParts.put("C198", new ArrayList<OperacaoAquisicaoProcReferenciado>(1));
        blockParts.put("C199", new ArrayList<OperacaoImportacaoCompl>(1));
        blockParts.put("C380", new ArrayList<NotaVendaConsumidor>(1));
        blockParts.put("C381", new ArrayList<DetalhamentoConsolidacaoPisPasep>(1));
        blockParts.put("C385", new ArrayList<DetalhamentoConsolidacaoCofins>(1));
        blockParts.put("C395", new ArrayList<NotaVendaConsumidorEntradasCredito>(1));
        blockParts.put("C396", new ArrayList<ItensDocumentoEntradaCredito>(1));
        blockParts.put("C400", new ArrayList<EquiapmentoEcf>(1));
        blockParts.put("C405", new ArrayList<ReducaoZ>(1));
        blockParts.put("C481", new ArrayList<ResumoDiarioPis>(1));
        blockParts.put("C485", new ArrayList<ResumoDiarioCofins>(1));
        blockParts.put("C489", new ArrayList<ResumoDiarioProcReferenciado>(1));
        blockParts.put("C490", new ArrayList<ConsolidacaoDocEmitidosEcf>(1));
        blockParts.put("C491", new ArrayList<ConsolidacaoDocEmitidosEcfPis>(1));
        blockParts.put("C495", new ArrayList<ConsolidacaoDocEmitidosEcfCofins>(1));
        blockParts.put("C499", new ArrayList<DetalhamentoConsolidacaoProcRef>(1));
        blockParts.put("C500", new ArrayList<NotaFiscalConsumo>(1));
        blockParts.put("C501", new ArrayList<ComplementoOperacaoPisPasep>(1));
        blockParts.put("C505", new ArrayList<>(1));
        blockParts.put("C509", new ArrayList<>(1));
        blockParts.put("C600", new ArrayList<>(1));
        blockParts.put("C601", new ArrayList<>(1));
        blockParts.put("C605", new ArrayList<>(1));
        blockParts.put("C609", new ArrayList<>(1));
        blockParts.put("C800", new ArrayList<>(1));
        blockParts.put("C810", new ArrayList<>(1));
        blockParts.put("C820", new ArrayList<>(1));
        blockParts.put("C830", new ArrayList<>(1));
        blockParts.put("C860", new ArrayList<>(1));
        blockParts.put("C870", new ArrayList<>(1));
        blockParts.put("C880", new ArrayList<>(1));
        blockParts.put("C890", new ArrayList<>(1));
        blockParts.put("C990", new EncerramentoBlocoC());
    }

    @Override
    public void setBlock(List<String> lines) {
        setList("C010", lines, IdentificacaoEstabelecimentoC.class);
        setList("C100", lines, NotaFiscal.class);
        setList("C110", lines, InformacaoComplementarNF.class);
        setList("C111", lines, ProcessoReferenciado.class);
        setList("C120", lines, OperacoesImportacao.class);
        setList("C170", lines, ItensDocumento.class);
        setList("C175", lines, RegistroAnaliticoDocumento.class);
        setList("C180", lines, ConsolidacaoNfeEmitidasPj.class);
        setList("C181", lines, OperacaoVendasPisPasep.class);
        setList("C185", lines, OperacaoVendasCofins.class);
        setList("C188", lines, OperacaoVendasProcReferenciado.class);
        setList("C190", lines, OperacoesAquisicao.class);
        setList("C191", lines, OperacaoAquisicaoPisPasep.class);
        setList("C195", lines, OperacaoAquisicaoCofins.class);
        setList("C198", lines, OperacaoAquisicaoProcReferenciado.class);
        setList("C199", lines, OperacaoImportacaoCompl.class);
        setList("C380", lines, NotaVendaConsumidor.class);
        setList("C381", lines, DetalhamentoConsolidacaoPisPasep.class);
        setList("C385", lines, DetalhamentoConsolidacaoCofins.class);
        setList("C395", lines, NotaVendaConsumidorEntradasCredito.class);
        setList("C396", lines, ItensDocumentoEntradaCredito.class);
        setList("C400", lines, EquiapmentoEcf.class);
        setList("C405", lines, ReducaoZ.class);
        setList("C481", lines, ResumoDiarioPis.class);
        setList("C485", lines, ResumoDiarioCofins.class);
        setList("C489", lines, ResumoDiarioProcReferenciado.class);
        setList("C490", lines, ConsolidacaoDocEmitidosEcf.class);
        setList("C491", lines, ConsolidacaoDocEmitidosEcfPis.class);
        setList("C495", lines, ConsolidacaoDocEmitidosEcfCofins.class);
        setList("C499", lines, DetalhamentoConsolidacaoProcRef.class);
        setList("C500", lines, NotaFiscalConsumo.class);
        setList("C501", lines, ComplementoOperacaoPisPasep.class);

        lines.stream().filter(s -> {
            String[] filter = {"|C001", "|C990"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
