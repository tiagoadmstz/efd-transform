package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M210: Detalhamento da Contribuição para o PIS/PASEP do Período.
 */
@Data
public class DetalhamentoContribPisPeriodo extends AbstractEfdBlockPart {

    private final String reg = "M210";
    private String codCont;
    private BigDecimal vlRecBrt;
    private BigDecimal vlBcCont;
    private BigDecimal aliqPis;
    private BigDecimal quantBcPis;
    private BigDecimal aliqPisQuant;
    private BigDecimal vlContApur;
    private BigDecimal vlAjusAcres;
    private BigDecimal vlAjusReduc;
    private BigDecimal vlContDifer;
    private BigDecimal vlContDiferAnt;
    private BigDecimal vlContPer;
}
