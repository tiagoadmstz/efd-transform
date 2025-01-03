package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M510: 	Ajustes do Crédito de COFINS Apurado.
 */
@Data
public class AjustesCreditoCofinsApurado extends AbstractEfdBlockPart {

    private final String reg = "M510";
    private String indAj;
    private BigDecimal vlAj;
    private String codAj;
    private String numDoc;
    private String descrAj;
    private String dtRef;
}
