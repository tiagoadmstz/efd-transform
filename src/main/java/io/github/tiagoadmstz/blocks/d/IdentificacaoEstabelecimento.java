package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro D010: Identificação do Estabelecimento.
 */
@Data
public class IdentificacaoEstabelecimento extends AbstractEfdBlockPart {

    private final String reg = "D010";
    private Number cnpj;
}
