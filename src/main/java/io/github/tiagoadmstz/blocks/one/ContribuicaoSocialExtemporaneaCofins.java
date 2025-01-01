package io.github.tiagoadmstz.blocks.one;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro 1600: Contribuição Social Extemporânea – COFINS
 */
@Data
public class ContribuicaoSocialExtemporaneaCofins extends AbstractEfdBlockPart {

    private final String reg = "1600";
    private String perApurAnt;
    private String natContRec;
    private BigDecimal vlContApur;
    private BigDecimal vlCredCofinsDesc;
    private BigDecimal vlContDev;
    private BigDecimal vlOutDed;
    private BigDecimal vlContExt;
    private BigDecimal vlMul;
    private BigDecimal vlJur;
    private String dtRecol;
}
