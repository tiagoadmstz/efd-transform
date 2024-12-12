package io.github.tiagoadmstz.blocks.i;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro I001: Abertura do Bloco I.
 */
@Data
public class AberturaBlocoI extends AbstractEfdBlockPart {

    private final String reg = "I001";
    /**
     * Indicador de movimento:
     * 0- Bloco com dados informados;
     * 1- Bloco sem dados informados.
     */
    private String indMov;
}
