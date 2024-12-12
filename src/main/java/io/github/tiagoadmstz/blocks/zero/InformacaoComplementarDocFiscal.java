package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 0450: Tabela de Informação Complementar do Documento Fiscal
 */
@Data
public class InformacaoComplementarDocFiscal extends AbstractEfdBlockPart {

    private final String reg = "0450";
    private String codInf;
    private String txt;
}
