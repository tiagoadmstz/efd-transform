package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro D001: Abertura do Bloco D.
 */
@Data
public class AberturaBlocoD extends AbstractEfdBlockPart {

    private final String reg = "D001";
    /**
     * Indicador de movimento:
     * 0- Bloco com dados informados;
     * 1- Bloco sem dados informados.
     */
    private String indMov;
}
