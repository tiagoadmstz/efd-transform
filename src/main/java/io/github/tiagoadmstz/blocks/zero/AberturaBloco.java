package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

@Data
public class AberturaBloco extends AbstractEfdBlockPart {

    private final String reg = "A001";
    /**
     * 0 - Bloco com dados informados;
     * 1 – Bloco sem dados informados.
     */
    private Number identificadorMovimento;
}
