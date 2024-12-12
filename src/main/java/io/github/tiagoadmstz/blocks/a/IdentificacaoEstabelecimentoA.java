package io.github.tiagoadmstz.blocks.a;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro A010: Identificação do Estabelecimento.
 */
@Data
public class IdentificacaoEstabelecimentoA extends AbstractEfdBlockPart {

    private final String reg = "A010";
    private Number cnpj;
}
