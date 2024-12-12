package io.github.tiagoadmstz.blocks.nine;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 9990: Encerramento do Bloco 9.
 */
@Data
public class EncerramentoBlocoNine extends AbstractEfdBlockPart {

    private final String reg = "9990";
    private String qtdLinNine;
}
