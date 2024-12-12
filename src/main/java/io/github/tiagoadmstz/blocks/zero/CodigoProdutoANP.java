package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 206: Código de Produto Conforme Tabela ANP (Combustíveis).
 */
@Data
public class CodigoProdutoANP extends AbstractEfdBlockPart {

    private final String reg = "0206";
    private String codComb;
}
