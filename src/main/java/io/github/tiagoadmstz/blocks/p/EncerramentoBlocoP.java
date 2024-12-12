package io.github.tiagoadmstz.blocks.p;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro P990: Encerramento do Bloco P.
 */
@Data
public class EncerramentoBlocoP extends AbstractEfdBlockPart {

    private final String reg = "P990";
    private String qtdLinP;
}
