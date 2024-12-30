package io.github.tiagoadmstz.blocks.i;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro I100: Consolidação das Operações do Período.
 */
@Data
public class ConsolidacaoOperacoesPeriodo extends AbstractEfdBlockPart {

    private final String reg = "I100";
    private BigDecimal vlRec;
    private String cstPisCofins;
    private BigDecimal vlTotDedGer;
    private BigDecimal vlTotDedEsp;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal vlPis;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal vlCofins;
    private String infoCompl;
}
