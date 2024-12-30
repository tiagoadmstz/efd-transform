package io.github.tiagoadmstz.blocks.p;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro P119: Processo Referenciado.
 */
@Data
public class CompEscrDetApuracaoContribuicaoProcRef extends AbstractEfdBlockPart {

    private final String reg = "P119";
    private String numProc;
    /**
     * Indicador da origem do processo:
     * 1 - Justiça Federal;
     * 3 – Secretaria da Receita Federal do Brasil;
     * 9 – Outros.
     */
    private String indProc;
}
