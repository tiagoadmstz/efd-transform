package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M600:Consolidação da Contribuição para a Seguridade Social - COFINS do Período.
 */
@Data
public class ConsContribSeguridadeSocialCofinsPeriodo extends AbstractEfdBlockPart {

    private final String reg = "M600";
    private BigDecimal vlTotContNcPer;
    private BigDecimal vlTotCredDesc;
    private BigDecimal vlTotCredDescAnt;
    private BigDecimal vlTotContNcDev;
    private BigDecimal vlRetNc;
    private BigDecimal vlOutDedNc;
    private BigDecimal vlContNcRec;
    private BigDecimal vlTotContCumPer;
    private BigDecimal vlRetCum;
    private BigDecimal vlOutDedCum;
    private BigDecimal vlContCumRec;
    private BigDecimal vlTotContRec;
}
