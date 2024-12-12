package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro C405: Redução Z (Códigos 02 e 2D).
 */
@Data
public class ReducaoZ extends AbstractEfdBlockPart {

    private final String reg = "C405";
    private LocalDate dtDoc;
    private Number cro;
    private Number crz;
    private Number numCodFin;
    private BigDecimal gtFin;
    private BigDecimal vlBrt;
}
