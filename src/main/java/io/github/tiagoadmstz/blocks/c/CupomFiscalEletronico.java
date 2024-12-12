package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro C800: Cupom Fiscal Eletrônico (Código 59).
 */
@Data
public class CupomFiscalEletronico extends AbstractEfdBlockPart {

    private final String reg = "C800";
    private String codMod;
    private Number codSit;
    private Number numCfe;
    private LocalDate dtDoc;
    private BigDecimal vlCfe;
    private BigDecimal vlPis;
    private BigDecimal vlCofins;
    private String cnpjCpf;
    private Number nrSat;
    private Number chvCfe;
    private BigDecimal vlDesc;
    private BigDecimal vlMerc;
    private BigDecimal vlOutDa;
    private BigDecimal vlIcms;
    private BigDecimal vlPisSt;
    private BigDecimal vlCofinsSt;
}
