package io.github.tiagoadmstz.blocks.p;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro P210: Ajuste da Contribuição Previdenciária Apurada Sobre a Receita Bruta.
 */
@Data
public class AjusteContribPrevApSobreReceitaBruta extends AbstractEfdBlockPart {

    private final String reg = "P210";
    private String indAj;
    private BigDecimal vlAj;
    private String codAj;
    private String numDoc;
    private String descrAj;
    private String dtRef;
}
