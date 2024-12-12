package io.github.tiagoadmstz.blocks.one;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 1001: Abertura do Bloco 1.
 */
@Data
public class AberturaBlocoOne extends AbstractEfdBlockPart {

    private final String reg = "1001";
    /**
     * Indicador de movimento:
     * 0 - Bloco com dados informados;
     * 1 - Bloco sem dados informados
     */
    private String indMov;
}
