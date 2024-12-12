package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 0120: Identificação de EFD-Contribuições Sem Dados a Escriturar.
 */
@Data
public class IdentificacaoSemDados extends AbstractEfdBlockPart {

    private final String reg = "0120";
    private String mesRefer;
    /**
     * Informação complementar do registro. No caso de escrituração sem dados, deve ser informado o real motivo dessa situação, conforme indicadores abaixo:
     * 01 - Pessoa jurídica imune ou isenta do IRPJ
     * 02 - Órgãos públicos, autarquias e fundações públicas
     * 03 - Pessoa jurídica inativa
     * 04 - Pessoa jurídica em geral, que não realizou operações geradoras de receitas (tributáveis ou não) ou de créditos
     * 05 - Sociedade em Conta de Participação - SCP, que não realizou operações geradoras de receitas (tributáveis ou não) ou de créditos
     * 06 - Sociedade Cooperativa, que não realizou operações geradoras de receitas (tributáveis ou não) ou de créditos
     * 07 - Escrituração decorrente de incorporação, fusão ou cisão, sem operações geradoras de receitas (tributáveis ou não) ou de créditos
     * 99 - Demais hipóteses de dispensa de escrituração, relacionadas no art. 5º, da IN RFB nº 1.252, de 2012
     */
    private String infComp;
}
