package io.github.tiagoadmstz.blocks;

import io.github.tiagoadmstz.annotations.EfdBlock;
import io.github.tiagoadmstz.blocks.zero.AberturaArquivoDigital;
import io.github.tiagoadmstz.blocks.zero.AberturaBloco;
import io.github.tiagoadmstz.blocks.zero.AlteracaoItem;
import io.github.tiagoadmstz.blocks.zero.CadastroEstabelecimento;
import io.github.tiagoadmstz.blocks.zero.CadastroParticipante;
import io.github.tiagoadmstz.blocks.zero.CentroCustos;
import io.github.tiagoadmstz.blocks.zero.CodigoGrupoMarcaComercial;
import io.github.tiagoadmstz.blocks.zero.CodigoProdutoANP;
import io.github.tiagoadmstz.blocks.zero.ComposicaoReceitasPeriodo;
import io.github.tiagoadmstz.blocks.zero.DadosContabilista;
import io.github.tiagoadmstz.blocks.zero.EncerramentoBloco;
import io.github.tiagoadmstz.blocks.zero.IdentificacaoItem;
import io.github.tiagoadmstz.blocks.zero.IdentificacaoScp;
import io.github.tiagoadmstz.blocks.zero.IdentificacaoSemDados;
import io.github.tiagoadmstz.blocks.zero.IdentificacaoUnidadesMedida;
import io.github.tiagoadmstz.blocks.zero.InformacaoComplementarDocFiscal;
import io.github.tiagoadmstz.blocks.zero.InformacaoItemNotaFiscal;
import io.github.tiagoadmstz.blocks.zero.PlanoContasContabeis;
import io.github.tiagoadmstz.blocks.zero.ReceitaBrutaMensal;
import io.github.tiagoadmstz.blocks.zero.RegimeApuracaoCPSRB;
import io.github.tiagoadmstz.blocks.zero.RegimesApuracaoContribuicaoSocial;
import io.github.tiagoadmstz.commons.AbstractEfdBlock;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@EfdBlock(prefix = "0")
public class BlockZero extends AbstractEfdBlock {

    public BlockZero() {
        blockParts.put("0000", new AberturaArquivoDigital());
        blockParts.put("0001", new AberturaBloco());
        blockParts.put("0035", new IdentificacaoScp());
        blockParts.put("0100", new DadosContabilista());
        blockParts.put("0110", new RegimesApuracaoContribuicaoSocial());
        blockParts.put("0111", new ReceitaBrutaMensal());
        blockParts.put("0120", new ArrayList<IdentificacaoSemDados>(1));
        blockParts.put("0140", new ArrayList<CadastroEstabelecimento>(1));
        blockParts.put("0145", new RegimeApuracaoCPSRB());
        blockParts.put("0150", new ArrayList<CadastroParticipante>(1));
        blockParts.put("0190", new ArrayList<IdentificacaoUnidadesMedida>(1));
        blockParts.put("0200", new ArrayList<IdentificacaoItem>(1));
        blockParts.put("0205", new ArrayList<AlteracaoItem>(1));
        blockParts.put("0206", new CodigoProdutoANP());
        blockParts.put("0208", new CodigoGrupoMarcaComercial());
        blockParts.put("0400", new ArrayList<InformacaoItemNotaFiscal>(1));
        blockParts.put("0450", new ArrayList<InformacaoComplementarDocFiscal>(1));
        blockParts.put("0500", new ArrayList<PlanoContasContabeis>());
        blockParts.put("0600", new ArrayList<CentroCustos>(1));
        blockParts.put("0900", new ComposicaoReceitasPeriodo());
        blockParts.put("0990", new EncerramentoBloco());
    }

    @Override
    public void setBlock(List<String> lines) {
        setList("0120", lines, IdentificacaoSemDados.class);
        setList("0140", lines, CadastroEstabelecimento.class);
        setList("0150", lines, CadastroParticipante.class);
        setList("0190", lines, IdentificacaoUnidadesMedida.class);
        setList("0200", lines, IdentificacaoItem.class);
        setList("0205", lines, AlteracaoItem.class);
        setList("0400", lines, InformacaoItemNotaFiscal.class);
        setList("0450", lines, InformacaoComplementarDocFiscal.class);
        setList("0500", lines, PlanoContasContabeis.class);

        lines.stream().filter(s -> {
            String[] filter = {"|0000", "|0001", "|0100", "|0110", "|0111", "|206", "|208", "|0900", "|0990"};
            return Arrays.stream(filter).anyMatch(s1 -> s.startsWith(s));
        }).forEach(s -> setBySplitedLine(s.split("\\|")));
    }
}
