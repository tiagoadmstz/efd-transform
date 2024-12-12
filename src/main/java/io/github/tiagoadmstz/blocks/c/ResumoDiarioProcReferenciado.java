package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro C489: Processo Referenciado.
 */
@Data
public class ResumoDiarioProcReferenciado extends AbstractEfdBlockPart {

    private final String reg = "C489";
    private String numProc;
    /**
     * Indicador da origem do processo:
     * 1 - Justiça Federal;
     * 3 – Secretaria da Receita Federal do Brasil
     * 9 - Outros.
     */
    private String indProc;
}
