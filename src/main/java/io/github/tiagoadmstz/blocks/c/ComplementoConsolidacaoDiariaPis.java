package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro C601: Complemento da Consolidação Diária (Códigos 06, 28 e 29) – Documentos de Saídas - PIS/Pasep.
 */
@Data
public class ComplementoConsolidacaoDiariaPis extends AbstractEfdBlockPart {

    private final String reg = "C601";
    private Number cstPis;
    private BigDecimal vlItem;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal vlPis;
    private String codCta;
}
