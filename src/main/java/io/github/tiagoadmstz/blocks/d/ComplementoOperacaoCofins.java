package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro D505: Complemento da Operação (Códigos 21 e 22) – Cofins.
 */
@Data
public class ComplementoOperacaoCofins extends AbstractEfdBlockPart {

    private final String reg = "D505";
    private Number cstCofins;
    private BigDecimal vlItem;
    private String natBcCred;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal vlCofins;
    private String codCta;
}
