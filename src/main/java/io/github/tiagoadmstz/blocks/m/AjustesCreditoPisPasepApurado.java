package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M110: Ajustes do Crédito de PIS/PASEP Apurado.
 */
@Data
public class AjustesCreditoPisPasepApurado extends AbstractEfdBlockPart {

    private final String reg = "M110";
    private String indAj;
    private BigDecimal vlAj;
    private String codAj;
    private String numDoc;
    private String descrAj;
    private String dtRef;
}
