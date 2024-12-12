package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro C110: Complemento do Documento - Informação Complementar da Nota Fiscal (Códigos 01, 1B, 04 e 55) da EFD-Contribuições.
 */
@Data
public class InformacaoComplementarNF extends AbstractEfdBlockPart {

    private final String reg = "C110";
    private String codInf;
    private String txtCompl;
}
