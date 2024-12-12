package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro C380: Nota Fiscal de Venda a Consumidor (Código 02) - Consolidação de Documentos Emitidos.
 */
@Data
public class NotaVendaConsumidor extends AbstractEfdBlockPart {

    private final String reg = "C380";
    private String codMod;
    private LocalDate dtDocIni;
    private LocalDate dtDocFin;
    private Number numDocIni;
    private Number numDocFin;
    private BigDecimal vlDoc;
    private BigDecimal vlDocCanc;
}
