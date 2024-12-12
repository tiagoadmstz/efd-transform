package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro C001: Abertura do Bloco C
 */
@Data
public class AberturaBlocoC extends AbstractEfdBlockPart {

    private final String reg = "C001";
    /**
     * Indicador de movimento:
     * 0 - Bloco com dados informados;
     * 1 - Bloco sem dados informados.
     */
    private String indMov;
}
