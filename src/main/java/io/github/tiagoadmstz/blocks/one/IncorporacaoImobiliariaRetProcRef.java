package io.github.tiagoadmstz.blocks.one;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 1809: Processo Referenciado.
 */
@Data
public class IncorporacaoImobiliariaRetProcRef extends AbstractEfdBlockPart {

    private final String reg = "1809";
    private String numProc;
    /**
     * Indicador da origem do processo:
     * 1 - Justiça Federal;
     * 3 – Secretaria da Receita Federal do Brasil
     * 9 – Outros.
     */
    private String indProc;
}
