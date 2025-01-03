package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M620: Ajustes da COFINS Apurada.
 */
@Data
public class AjustesCofinsApurada extends AbstractEfdBlockPart {

    private final String reg = "M620";
    /**
     * Indicador do tipo de ajuste:
     * 0- Ajuste de redução;
     * 1- Ajuste de acréscimo.
     */
    private String indAj;
    private BigDecimal vlAj;
    private String codAj;
    private String numDoc;
    private String descrAj;
    private String dtRef;
}
