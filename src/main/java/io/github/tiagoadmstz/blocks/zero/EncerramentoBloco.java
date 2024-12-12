package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registo 0990: Encerramento do Bloco 0.
 */
@Data
public class EncerramentoBloco extends AbstractEfdBlockPart {

    private final String reg = "0990";
    private Number qtdLin0;
}
