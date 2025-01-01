package io.github.tiagoadmstz.blocks.one;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro 1200: Contribuição Social Extemporânea – PIS/PASEP.
 */
@Data
public class ContribuicaoSocialExtemporaneaPisPasep extends AbstractEfdBlockPart {

    private final String reg = "1200";
    private String perApurAnt;
    private String natContRec;
    private BigDecimal vlContApur;
    private BigDecimal vlCredPisDesc;
    private BigDecimal vlContDev;
    private BigDecimal vlOutDed;
    private BigDecimal vlContExt;
    private BigDecimal vlMul;
    private BigDecimal vlJur;
    private String dtRecol;
}
