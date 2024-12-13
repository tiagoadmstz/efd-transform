package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro D209: Processo Referenciado.
 */
@Data
public class ResumoEscrituracaoDiariaProcRef extends AbstractEfdBlockPart {

    private final String reg = "D209";
    private String numProc;
    /**
     * Indicador da origem do processo:
     * 1 - Justiça Federal;
     * 3 – Secretaria da Receita Federal do Brasil;
     * 9 – Outros.
     */
    private String indProc;
}
