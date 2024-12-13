package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.blocks.d.AberturaBlocoD;
import io.github.tiagoadmstz.blocks.d.AquisicaoServicoTransporte;
import io.github.tiagoadmstz.blocks.d.AquisicaoServicoTransporteProcRef;
import io.github.tiagoadmstz.blocks.d.ComplementoConsolidacaoPrestServCofins;
import io.github.tiagoadmstz.blocks.d.ComplementoConsolidacaoPrestServPis;
import io.github.tiagoadmstz.blocks.d.ComplementoDocTranspCofins;
import io.github.tiagoadmstz.blocks.d.ComplementoDocTranspPisPasep;
import io.github.tiagoadmstz.blocks.d.ComplementoOperacaoCofins;
import io.github.tiagoadmstz.blocks.d.ComplementoOperacaoPisPasep;
import io.github.tiagoadmstz.blocks.d.ConsolidacaoPrestacaoServico;
import io.github.tiagoadmstz.blocks.d.ConsolidacaoPrestacaoServicoProcRef;
import io.github.tiagoadmstz.blocks.d.EncerramentoBlocoD;
import io.github.tiagoadmstz.blocks.d.IdentificacaoEstabelecimento;
import io.github.tiagoadmstz.blocks.d.NfsComunicacao;
import io.github.tiagoadmstz.blocks.d.NfsComunicacaoProcRef;
import io.github.tiagoadmstz.blocks.d.ResumoDiarioCupomFiscalEcf;
import io.github.tiagoadmstz.blocks.d.ResumoDiarioCupomFiscalEcfProcRef;
import io.github.tiagoadmstz.blocks.d.ResumoEscrituracaoDiaria;
import io.github.tiagoadmstz.blocks.d.ResumoEscrituracaoDiariaBilhetes;
import io.github.tiagoadmstz.blocks.d.ResumoEscrituracaoDiariaBilhetesProcRef;
import io.github.tiagoadmstz.blocks.d.ResumoEscrituracaoDiariaProcRef;
import io.github.tiagoadmstz.blocks.d.TotalizacaoResumoDiarioCofins;
import io.github.tiagoadmstz.blocks.d.TotalizacaoResumoDiarioPisPasep;
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
        blockParts.put("D010", new ArrayList<IdentificacaoEstabelecimento>(1));

        blockParts.put("D100", new ArrayList<AquisicaoServicoTransporte>(1));
        blockParts.put("D101", new ArrayList<ComplementoDocTranspPisPasep>(1));
        blockParts.put("D105", new ArrayList<ComplementoDocTranspCofins>(1));
        blockParts.put("D111", new ArrayList<AquisicaoServicoTransporteProcRef>(1));
        blockParts.put("D200", new ArrayList<ResumoEscrituracaoDiaria>(1));
        blockParts.put("D201", new ArrayList<TotalizacaoResumoDiarioPisPasep>(1));
        blockParts.put("D205", new ArrayList<TotalizacaoResumoDiarioCofins>(1));
        blockParts.put("D209", new ArrayList<ResumoEscrituracaoDiariaProcRef>(1));
        blockParts.put("D300", new ArrayList<ResumoEscrituracaoDiariaBilhetes>(1));
        blockParts.put("D309", new ArrayList<ResumoEscrituracaoDiariaBilhetesProcRef>(1));
        blockParts.put("D350", new ArrayList<ResumoDiarioCupomFiscalEcf>(1));
        blockParts.put("D359", new ArrayList<ResumoDiarioCupomFiscalEcfProcRef>(1));
        blockParts.put("D500", new ArrayList<NfsComunicacao>(1));
        blockParts.put("D501", new ArrayList<ComplementoOperacaoPisPasep>(1));
        blockParts.put("D505", new ArrayList<ComplementoOperacaoCofins>(1));
        blockParts.put("D509", new ArrayList<NfsComunicacaoProcRef>(1));
        blockParts.put("D600", new ArrayList<ConsolidacaoPrestacaoServico>(1));
        blockParts.put("D601", new ArrayList<ComplementoConsolidacaoPrestServPis>(1));
        blockParts.put("D605", new ArrayList<ComplementoConsolidacaoPrestServCofins>(1));
        blockParts.put("D609", new ArrayList<ConsolidacaoPrestacaoServicoProcRef>(1));
        blockParts.put("D990", new EncerramentoBlocoD());
    }

    public void setBlock(List<String> lines) {
        setList("D010", lines, IdentificacaoEstabelecimento.class);
        setList("D100", lines, AquisicaoServicoTransporte.class);
        setList("D101", lines, ComplementoDocTranspPisPasep.class);
        setList("D105", lines, ComplementoDocTranspCofins.class);
        setList("D111", lines, AquisicaoServicoTransporteProcRef.class);
        setList("D200", lines, ResumoEscrituracaoDiaria.class);
        setList("D201", lines, TotalizacaoResumoDiarioPisPasep.class);
        setList("D205", lines, TotalizacaoResumoDiarioCofins.class);
        setList("D209", lines, ResumoEscrituracaoDiariaProcRef.class);
        setList("D300", lines, ResumoEscrituracaoDiariaBilhetes.class);
        setList("D309", lines, ResumoEscrituracaoDiariaBilhetesProcRef.class);
        setList("D350", lines, ResumoDiarioCupomFiscalEcf.class);
        setList("D359", lines, ResumoDiarioCupomFiscalEcfProcRef.class);
        setList("D500", lines, NfsComunicacao.class);
        setList("D501", lines, ComplementoOperacaoPisPasep.class);
        setList("D505", lines, ComplementoOperacaoCofins.class);
        setList("D509", lines, NfsComunicacaoProcRef.class);
        setList("D600", lines, ConsolidacaoPrestacaoServico.class);
        setList("D601", lines, ComplementoConsolidacaoPrestServPis.class);
        setList("D605", lines, ComplementoConsolidacaoPrestServCofins.class);
        setList("D609", lines, ConsolidacaoPrestacaoServicoProcRef.class);

        lines.stream().filter(s -> {
            String[] filter = {"|D001", "|D010", "|D509", "|D600", "|D601", "|D605", "|D609"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
