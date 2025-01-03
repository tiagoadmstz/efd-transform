package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M350: 	PIS/PASEP - Folha de Salários.
 */
@Data
public class PisPasepFolhaSalarios extends AbstractEfdBlockPart {

    private final String reg = "M350";
    private BigDecimal vlTotFol;
    private BigDecimal vlExcBc;
    private BigDecimal vlTotBc;
    private BigDecimal aliqPisFol;
    private BigDecimal vlTotContFol;
}
