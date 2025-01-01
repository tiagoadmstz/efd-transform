package io.github.tiagoadmstz.blocks.one;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro 1620: Demonstração do Crédito a Descontar da Contribuição Extemporânea – COFINS.
 */
@Data
public class DemoCredDescontarContribExtempCofins extends AbstractEfdBlockPart {

    private final String reg = "1620";
    private String perApuCred;
    private String origCred;
    private String codCred;
    private BigDecimal vlCred;
}
