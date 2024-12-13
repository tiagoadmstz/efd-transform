package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro D201: Totalização do Resumo Diário – PIS/Pasep.
 */
@Data
public class TotalizacaoResumoDiarioPisPasep extends AbstractEfdBlockPart {

    private final String reg = "D201";
    private Number cstPis;
    private BigDecimal vlItem;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal vlPis;
    private String codCta;
}
