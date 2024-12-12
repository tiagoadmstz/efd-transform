package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro C381: Detalhamento da Consolidação – PIS/Pasep.
 */
@Data
public class DetalhamentoConsolidacaoPisPasep extends AbstractEfdBlockPart {

    private final String reg = "C381";
    private Number cstPis;
    private String codItem;
    private BigDecimal vlItem;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal quantBcPis;
    private BigDecimal aliqPisQuant;
    private BigDecimal vlPis;
    private String codCta;
}
