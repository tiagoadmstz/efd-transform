package io.github.tiagoadmstz.blocks.i;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro I010: Identificação da Pessoa Jurídica/Estabelecimento.
 */
@Data
public class IdentificacaoPessoaJuridica extends AbstractEfdBlockPart {

    private final String reg = "I010";
    private String cnpj;
    /**
     * Indicador de operações realizadas no período:
     * 01 – Exclusivamente operações de Instituições Financeiras e Assemelhadas;
     * 02 – Exclusivamente operações de Seguros Privados;
     * 03 – Exclusivamente operações de Previdência Complementar;
     * 04 – Exclusivamente operações de Capitalização;
     * 05 – Exclusivamente operações de Planos de Assistência à Saúde;
     * 06 – Realizou operações referentes a mais de um dos indicadores acima.
     */
    private String indAtiv;
    private String infoCompl;
}
