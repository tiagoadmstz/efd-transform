package io.github.tiagoadmstz.blocks.a;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro A001: Abertura do Bloco A
 */
@Data
public class AberturaBlocoA extends AbstractEfdBlockPart {

    private final String reg = "A001";
    /**
     * Indicador de movimento:
     * 0 - Bloco com dados informados;
     * 1 - Bloco sem dados informados.
     */
    private Number indMov;
}
