package io.github.tiagoadmstz.blocks.nine;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 9001: Abertura do Bloco 9.
 */
@Data
public class AberturaBlocoNine extends AbstractEfdBlockPart {

    private final String reg = "9001";
    private String indMov;
}
