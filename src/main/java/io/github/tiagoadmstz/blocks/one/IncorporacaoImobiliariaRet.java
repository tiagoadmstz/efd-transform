package io.github.tiagoadmstz.blocks.one;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro 1800: Incorporação Imobiliária – RET.
 */
@Data
public class IncorporacaoImobiliariaRet extends AbstractEfdBlockPart {

    private final String reg = "1800";
    private String incImob;
    private BigDecimal recRecebRet;
    private BigDecimal recFinRet;
    private BigDecimal bcRet;
    private BigDecimal aliqRet;
    private BigDecimal vlRecUni;
    private String dtRecUni;
    private String codRec;
}
