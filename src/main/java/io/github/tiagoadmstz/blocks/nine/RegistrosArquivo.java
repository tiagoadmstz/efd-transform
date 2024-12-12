package io.github.tiagoadmstz.blocks.nine;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 9900:
 */
@Data
public class RegistrosArquivo extends AbstractEfdBlockPart {

    private final String reg = "9900";
    private String regTag;
    private String qtdReg;
}
