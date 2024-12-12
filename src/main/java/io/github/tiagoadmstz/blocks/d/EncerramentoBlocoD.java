package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro D990: Encerramento do Bloco D.
 */
@Data
public class EncerramentoBlocoD extends AbstractEfdBlockPart {

    private final String reg = "D990";
    private Number qtdLinD;
}
