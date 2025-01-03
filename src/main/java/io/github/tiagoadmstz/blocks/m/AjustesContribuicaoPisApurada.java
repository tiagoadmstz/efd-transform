package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M220: Ajustes da Contribuição para o PIS/PASEP Apurada.
 */
@Data
public class AjustesContribuicaoPisApurada extends AbstractEfdBlockPart {

    private final String reg = "M220";
    private String indAj;
    private BigDecimal vlAj;
    private String codAj;
    private String numDoc;
    private String descrAj;
    private String dtRef;
}
