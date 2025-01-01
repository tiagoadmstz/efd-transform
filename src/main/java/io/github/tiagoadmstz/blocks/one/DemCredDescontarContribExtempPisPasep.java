package io.github.tiagoadmstz.blocks.one;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro 1220: Demonstração do Crédito a Descontar a Contribuição Extemporânea – PIS/Pasep.
 */
@Data
public class DemCredDescontarContribExtempPisPasep extends AbstractEfdBlockPart {

    private final String reg = "1220";
    private String perApuCred;
    private String origCred;
    private String codCred;
    private BigDecimal vlCred;
}
