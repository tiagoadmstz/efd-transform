package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro M001: Abertura do Bloco M.
 */
@Data
public class AberturaBlocoM extends AbstractEfdBlockPart {

    private final String reg = "M001";
    /**
     * Indicador de movimento:
     * 0- Bloco com dados informados;
     * 1- Bloco sem dados informados.
     */
    private String indMov;
}
