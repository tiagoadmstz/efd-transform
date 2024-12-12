package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 0190: Identificação das Unidades de Medida.
 */
@Data
public class IdentificacaoUnidadesMedida extends AbstractEfdBlockPart {

    private final String reg = "0190";
    private String unid;
    private String descr;
}
