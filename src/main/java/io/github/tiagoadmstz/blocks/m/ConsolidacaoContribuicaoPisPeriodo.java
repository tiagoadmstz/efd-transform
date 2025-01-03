package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M200: Consolidação da Contribuição para o PIS/PASEP do Período.
 */
@Data
public class ConsolidacaoContribuicaoPisPeriodo extends AbstractEfdBlockPart {

    private final String reg = "M200";
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
