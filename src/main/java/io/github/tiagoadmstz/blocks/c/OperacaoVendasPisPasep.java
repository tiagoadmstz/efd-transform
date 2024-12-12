package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro C181: Detalhamento da Consolidação - Operações de Vendas - PIS/Pasep.
 */
@Data
public class OperacaoVendasPisPasep extends AbstractEfdBlockPart {

    private final String reg = "C181";
    private Number cstPis;
    private Number cfop;
    private BigDecimal vlItem;
    private BigDecimal vlDesc;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal quantBcPis;
    private BigDecimal aliqPisQuant;
    private BigDecimal vlPis;
    private String codCta;
}
