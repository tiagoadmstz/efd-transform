package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro C495: Detalhamento da Consolidação de Documentos Emitidos por ECF (Códigos 02, 2D, 59 e 60) – Cofins.
 */
@Data
public class ConsolidacaoDocEmitidosEcfCofins extends AbstractEfdBlockPart {

    private final String reg = "C495";
    private String codItem;
    private Number cstCofins;
    private Number cfop;
    private BigDecimal vlItem;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal quantBcCofins;
    private BigDecimal aliqCofinsQuant;
    private BigDecimal vlCofins;
    private String codCta;
}
