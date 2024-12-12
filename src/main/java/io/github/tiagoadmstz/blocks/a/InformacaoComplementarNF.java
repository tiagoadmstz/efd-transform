package io.github.tiagoadmstz.blocks.a;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro A110: Complemento do Documento - Informação Complementar da NF.
 */
@Data
public class InformacaoComplementarNF extends AbstractEfdBlockPart {

    private final String reg = "A110";
    private String codInf;
    private String txtCompl;
}
