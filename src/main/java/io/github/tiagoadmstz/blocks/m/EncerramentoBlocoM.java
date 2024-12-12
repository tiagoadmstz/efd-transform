package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro M990: Encerramento do Bloco M.
 */
@Data
public class EncerramentoBlocoM extends AbstractEfdBlockPart {

    private final String reg = "M990";
    private String qtdLinM;
}
