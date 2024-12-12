package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro C501: Complemento da Operação (Códigos 06, 28 e 29) – PIS/Pasep.
 */
@Data
public class ComplementoOperacaoPisPasep extends AbstractEfdBlockPart {

    private final String reg = "C501";
    private Number cstPis;
    private BigDecimal vlItem;
    private String natBcCred;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal vlPis;
    private String codCta;
}
