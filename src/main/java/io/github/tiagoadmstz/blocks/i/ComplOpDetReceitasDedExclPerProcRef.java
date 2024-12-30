package io.github.tiagoadmstz.blocks.i;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro I399: Processo Referenciado.
 */
@Data
public class ComplOpDetReceitasDedExclPerProcRef extends AbstractEfdBlockPart {

    private final String reg = "I399";
    private String numProc;
    /**
     * Indicador da origem do processo:
     * 1 - Justiça Federal;
     * 3 – Secretaria da Receita Federal do Brasil
     * 9 – Outros.
     */
    private String indProc;
}
