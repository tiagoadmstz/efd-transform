package io.github.tiagoadmstz.blocks.p;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro P010: Identificação do Estabelecimento.
 */
@Data
public class IdentificacaoEstabelecimento extends AbstractEfdBlockPart {

    private final String reg = "P010";
    private String cnpj;
}
