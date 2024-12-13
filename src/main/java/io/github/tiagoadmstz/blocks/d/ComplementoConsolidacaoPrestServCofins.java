package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro D605: Complemento da Consolidação da Prestação de Serviços (Códigos 21 e 22) – Cofins.
 */
@Data
public class ComplementoConsolidacaoPrestServCofins extends AbstractEfdBlockPart {

    private final String reg = "D605";
    private Number codClass;
    private BigDecimal vlItem;
    private BigDecimal vlDesc;
    private Number cstCofins;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal vlCofins;
    private String codCta;
}
