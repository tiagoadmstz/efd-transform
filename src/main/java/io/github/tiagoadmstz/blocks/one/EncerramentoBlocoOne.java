package io.github.tiagoadmstz.blocks.one;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 1990: Encerramento do Bloco 1.
 */
@Data
public class EncerramentoBlocoOne extends AbstractEfdBlockPart {

    private final String reg = "1990";
    private String qtdLinOne;
}
