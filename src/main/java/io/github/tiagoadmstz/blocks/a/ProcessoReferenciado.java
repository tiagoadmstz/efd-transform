package io.github.tiagoadmstz.blocks.a;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro A111: Processo Referenciado.
 */
@Data
public class ProcessoReferenciado extends AbstractEfdBlockPart {

    private final String reg = "A111";
    private String numProc;
    /**
     * Indicador da origem do processo:
     * 1 - Justiça Federal;
     * 3 – Secretaria da Receita Federal do Brasil;
     * 9 - Outros.
     */
    private String indProc;
}
