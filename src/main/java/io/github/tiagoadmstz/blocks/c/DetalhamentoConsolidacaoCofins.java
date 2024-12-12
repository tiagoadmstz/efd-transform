package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro C385: Detalhamento da Consolidação – Cofins.
 */
@Data
public class DetalhamentoConsolidacaoCofins extends AbstractEfdBlockPart {

    private final String reg = "C385";
    private Number cstCofins;
    private String codItem;
    private BigDecimal vlItem;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal quantBcCofins;
    private BigDecimal aliqCofinsQuant;
    private BigDecimal vlCofins;
    private String codCta;
}
