package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.annotations.EfdBlock;
import io.github.tiagoadmstz.blocks.a.AberturaBlocoA;
import io.github.tiagoadmstz.blocks.a.ComplementoDocumentoItem;
import io.github.tiagoadmstz.blocks.a.DocumentoNotaFiscalServico;
import io.github.tiagoadmstz.blocks.a.EncerramentoBloco;
import io.github.tiagoadmstz.blocks.a.IdentificacaoEstabelecimentoA;
import io.github.tiagoadmstz.blocks.a.InformacaoComplementarNF;
import io.github.tiagoadmstz.blocks.a.OperacoesImportacao;
import io.github.tiagoadmstz.blocks.a.ProcessoReferenciado;
import io.github.tiagoadmstz.commons.AbstractEfdBlock;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Bloco A: Documentos Fiscais - Serviços (Sujeitos ao ISS).
 */
@Data
@EfdBlock(prefix = "A")
public class BlockA extends AbstractEfdBlock {

    private final Map<String, Object> blockParts;

    public BlockA() {
        blockParts = HashMap.newHashMap(1);
        blockParts.put("A001", new AberturaBlocoA());
        blockParts.put("A010", new ArrayList<IdentificacaoEstabelecimentoA>(1));
        blockParts.put("A100", new ArrayList<DocumentoNotaFiscalServico>(1));
        blockParts.put("A110", new ArrayList<InformacaoComplementarNF>(1));
        blockParts.put("A111", new ArrayList<ProcessoReferenciado>(1));
        blockParts.put("A120", new ArrayList<OperacoesImportacao>(1));
        blockParts.put("A170", new ArrayList<ComplementoDocumentoItem>(1));
        blockParts.put("A990", new EncerramentoBloco());
    }

    @Override
    public void setBlock(List<String> lines) {
        setList("A010", lines, IdentificacaoEstabelecimentoA.class);
        setList("A100", lines, DocumentoNotaFiscalServico.class);
        setList("A110", lines, InformacaoComplementarNF.class);
        setList("A111", lines, ProcessoReferenciado.class);
        setList("A120", lines, OperacoesImportacao.class);
        setList("A170", lines, ComplementoDocumentoItem.class);

        lines.stream().filter(s -> {
            String[] filter = {"|A001", "|A990"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
