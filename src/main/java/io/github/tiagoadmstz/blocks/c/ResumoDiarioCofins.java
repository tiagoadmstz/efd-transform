package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro C485: Resumo Diário de Documentos Emitidos por ECF – Cofins (Códigos 02 e 2D).
 */
@Data
public class ResumoDiarioCofins extends AbstractEfdBlockPart {

    private final String reg = "C485";
    private Number cstCofins;
    private BigDecimal vlItem;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal quantBcCofins;
    private BigDecimal aliqCofinsQuant;
    private BigDecimal vlCofins;
    private String codItem;
    private String codCta;
}
