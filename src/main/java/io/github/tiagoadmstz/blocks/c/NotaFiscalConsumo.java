package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro C500: Nota Fiscal/Conta de Energia Elétrica (Código 06), Nota Fiscal/Conta de Fornecimento Dágua Canalizada (Código 29) e Nota Fiscal Consumo Fornecimento de Gás (Código 28) e NF-e (Código 55) – Documentos de Entrada/Aquisição com Crédito.
 */
@Data
public class NotaFiscalConsumo extends AbstractEfdBlockPart {

    private final String reg = "C500";
    private String codPart;
    private String codMod;
    private Number codSit;
    private String ser;
    private Number sub;
    private Number numDoc;
    private LocalDate dtDoc;
    private LocalDate dtEnt;
    private BigDecimal vlDoc;
    private BigDecimal vlIcms;
    private String codInf;
    private BigDecimal vlPis;
    private BigDecimal vlCofins;
    private Number chvDoce;
}
