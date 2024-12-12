package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro C609: Processo Referenciado.
 */
@Data
public class ComplementoConsolidacaoDiariaProcRef extends AbstractEfdBlockPart {

    private final String reg = "C609";
    private Number numProc;
    /**
     * Indicador da origem do processo:
     * 1 - Justiça Federal;
     * 3 – Secretaria da Receita Federal do Brasil
     * 9 – Outros.
     */
    private String indProc;
}
