package io.github.tiagoadmstz.blocks.f;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro F129: Processo Referenciado.
 */
@Data
public class ProcessoReferenciadoAtivoImob extends AbstractEfdBlockPart {

    private final String reg = "F129";
    private String numProc;
    /**
     * Indicador da origem do processo:
     * 1 - Justiça Federal;
     * 3 – Secretaria da Receita Federal do Brasil
     * 9 – Outros.
     */
    private String indProc;
}
