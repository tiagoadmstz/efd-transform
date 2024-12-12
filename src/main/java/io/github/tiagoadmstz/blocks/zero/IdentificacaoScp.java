package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 0035 - Identificação de Sociedade em Conta de Participação – SCP
 */
@Data
public class IdentificacaoScp extends AbstractEfdBlockPart {

    private final String reg = "0035";
    private Number codScp;
    private String descScp;
    private String infComp;
}
