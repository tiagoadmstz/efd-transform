package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro D350: Resumo Diário de Cupom Fiscal Emitido Por ECF - (Código: 2E, 13, 14, 15 e 16).
 */
@Data
public class ResumoDiarioCupomFiscalEcf extends AbstractEfdBlockPart {

    private final String reg = "D350";
    private String codMod;
    private String ecfMod;
    private String ecfFab;
    private LocalDate dtDoc;
    private Number cro;
    private Number crz;
    private Number numCooFin;
    private BigDecimal gtFin;
    private BigDecimal vlBrt;
    private Number cstPis;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal quantBcPis;
    private BigDecimal aliqPisQuant;
    private BigDecimal vlPis;
    private Number cstCofins;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal quantBcCofins;
    private BigDecimal aliqCofinsQuant;
    private BigDecimal vlCofins;
    private String codCta;
}
