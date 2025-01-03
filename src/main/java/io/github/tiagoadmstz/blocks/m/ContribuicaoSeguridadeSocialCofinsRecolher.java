package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M605: Contribuição para a Seguridade Social - COFINS a Recolher.
 */
@Data
public class ContribuicaoSeguridadeSocialCofinsRecolher extends AbstractEfdBlockPart {

    private final String reg = "M605";
    private String numCampo;
    private String codRec;
    private BigDecimal vlDebito;
}
