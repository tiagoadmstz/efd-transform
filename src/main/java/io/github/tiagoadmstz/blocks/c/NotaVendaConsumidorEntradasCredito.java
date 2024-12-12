package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro C395: Detalhamento da Consolidação – Cofins.
 */
@Data
public class NotaVendaConsumidorEntradasCredito extends AbstractEfdBlockPart {

    private final String reg = "C395";
    private String codMod;
    private String codPart;
    private String ser;
    private String subSer;
    private String numDoc;
    private LocalDate dtDoc;
    private BigDecimal vlDoc;
}
