package io.github.tiagoadmstz.blocks.p;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro P001: Abertura do Bloco P.
 */
@Data
public class AberturaBlocoP extends AbstractEfdBlockPart {

    private final String reg = "P001";
    /**
     * Indicador de movimento:
     * 0 - Bloco com dados informados;
     * 1 - Bloco sem dados informados
     */
    private String indMov;
}
