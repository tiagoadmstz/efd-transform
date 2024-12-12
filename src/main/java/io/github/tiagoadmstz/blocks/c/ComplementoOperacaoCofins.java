package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro C505: Complemento da Operação (Códigos 06, 28 e 29) – Cofins.
 */
@Data
public class ComplementoOperacaoCofins extends AbstractEfdBlockPart {

    private final String reg = "C505";
    private Number cstCofins;
    private BigDecimal vlItem;
    private String natBcCred;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal vlCofins;
    private String codCta;
}
