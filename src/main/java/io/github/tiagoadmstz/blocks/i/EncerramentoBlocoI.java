package io.github.tiagoadmstz.blocks.i;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * 	Registro I990: Encerramento do Bloco I
 */
@Data
public class EncerramentoBlocoI extends AbstractEfdBlockPart {

    private final String reg = "I990";
    private String qtdLinI;
}
