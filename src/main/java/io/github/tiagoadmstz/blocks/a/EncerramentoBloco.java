package io.github.tiagoadmstz.blocks.a;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

@Data
public class EncerramentoBloco extends AbstractEfdBlockPart {

    private final String reg = "A990";
    private Number qtdLinA;
}
