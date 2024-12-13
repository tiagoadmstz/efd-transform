package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro D500: Nota Fiscal de Serviço de Comunicação (Código 21) e Nota Fiscal de Serviço de Telecomunicação (Código 22) – Documentos de Aquisição com Direito a Crédito.
 */
@Data
public class NfsComunicacao extends AbstractEfdBlockPart {

    private final String reg = "D500";
    private String indOper;
    private String indEmit;
    private String codPart;
    private String codMod;
    private Number codSit;
    private String ser;
    private Number sub;
    private Number numDoc;
    private LocalDate dtDoc;
    private LocalDate dtAP;
    private BigDecimal vlDoc;
    private BigDecimal vlDesc;
    private BigDecimal vlServ;
    private BigDecimal vlServNt;
    private BigDecimal vlTerc;
    private BigDecimal vlDa;
    private BigDecimal vlBcIcms;
    private BigDecimal vlIcms;
    private String codInf;
    private BigDecimal vlPis;
    private BigDecimal vlCofins;
}
