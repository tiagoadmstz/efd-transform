package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro C990: Encerramento do Bloco C
 */
@Data
public class EncerramentoBlocoC extends AbstractEfdBlockPart {

    private final String reg = "C990";
    private Number qtdLinC;
}
