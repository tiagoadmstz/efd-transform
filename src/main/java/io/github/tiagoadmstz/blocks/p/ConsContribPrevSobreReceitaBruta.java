package io.github.tiagoadmstz.blocks.p;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro P200: Consolidação da Contribuição Previdenciária Sobre a Receita Bruta.
 */
@Data
public class ConsContribPrevSobreReceitaBruta extends AbstractEfdBlockPart {

    private final String reg = "P200";
    private String perRef;
    private BigDecimal vlTotContApu;
    private BigDecimal vlTotAjReduc;
    private BigDecimal vlTotAjAcres;
    private BigDecimal vlTotContDev;
    private String codRec;
}
