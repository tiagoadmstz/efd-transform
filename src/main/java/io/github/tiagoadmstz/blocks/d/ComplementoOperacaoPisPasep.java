package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro D501: Complemento da Operação (Códigos 21 e 22) – PIS/Pasep.
 */
@Data
public class ComplementoOperacaoPisPasep extends AbstractEfdBlockPart {

    private final String reg = "D501";
    private Number cstPis;
    private BigDecimal vlItem;
    private String natBcCred;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal vlPis;
    private String codCta;
}
