package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro D309: Processo Referenciado.
 */
@Data
public class ResumoEscrituracaoDiariaBilhetesProcRef extends AbstractEfdBlockPart {

    private final String reg = "D309";
    private String numProc;
    /**
     * Indicador da origem do processo:
     * 1 - Justiça Federal;
     * 3 – Secretaria da Receita Federal do Brasil;
     * 9 – Outros.
     */
    private String indProc;
}
