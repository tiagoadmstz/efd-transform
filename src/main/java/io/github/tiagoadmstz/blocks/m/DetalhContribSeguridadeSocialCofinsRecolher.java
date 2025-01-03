package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M610: Detalhamento da Contribuição para a Seguridade Social - Cofins do Período.
 */
@Data
public class DetalhContribSeguridadeSocialCofinsRecolher extends AbstractEfdBlockPart {

    private final String reg = "M610";
    private String codCont;
    private BigDecimal vlRecBrt;
    private BigDecimal vlBcCont;
    private BigDecimal aliqCofins;
    private BigDecimal quantBcCofins;
    private BigDecimal aliqCofinsQuant;
    private BigDecimal vlContApur;
    private BigDecimal vlAjusAcres;
    private BigDecimal vlAjusReduc;
    private BigDecimal vlContDifer;
    private BigDecimal vlContDiferAnt;
    private BigDecimal vlContPer;
}
