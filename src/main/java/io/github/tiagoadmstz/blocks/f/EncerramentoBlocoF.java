package io.github.tiagoadmstz.blocks.f;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro F990: Encerramento do Bloco F.
 */
@Data
public class EncerramentoBlocoF extends AbstractEfdBlockPart {

    private final String reg = "F990";
    private Number qtdLinF;
}
