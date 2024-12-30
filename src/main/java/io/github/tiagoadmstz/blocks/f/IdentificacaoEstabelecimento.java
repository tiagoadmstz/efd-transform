package io.github.tiagoadmstz.blocks.f;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro F010: Identificação do Estabelecimento.
 */
@Data
public class IdentificacaoEstabelecimento extends AbstractEfdBlockPart {

    private final String reg = "F010";
    private Number cnpj;
}
