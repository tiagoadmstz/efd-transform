package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 0400: Tabela de Informação do Item da Nota Fiscal
 */
@Data
public class InformacaoItemNotaFiscal extends AbstractEfdBlockPart {

    private final String reg = "0400";
    private String codNat;
    private String descrNat;
}
