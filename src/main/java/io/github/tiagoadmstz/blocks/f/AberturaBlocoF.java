package io.github.tiagoadmstz.blocks.f;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro F001: Abertura do Bloco F.
 */
@Data
public class AberturaBlocoF extends AbstractEfdBlockPart {

    private final String reg = "F001";
    /**
     * Indicador de movimento:
     * 0- Bloco com dados informados;
     * 1- Bloco sem dados informados
     */
    private String indMov;
}
