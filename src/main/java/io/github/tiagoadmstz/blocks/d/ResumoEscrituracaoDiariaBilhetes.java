package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro D300: Resumo da Escrituração Diária - Bilhetes Consolidados de Passagem Rodoviário (Código 13), de Passagem Aquaviário (Código 14), de Passagem e Nota de Bagagem (Código 15), de Passagem Ferroviário (Código 16) e Resumo de Movimento Diário (Código 18).
 */
@Data
public class ResumoEscrituracaoDiariaBilhetes extends AbstractEfdBlockPart {

    private final String reg = "D300";
    private String codMod;
    private String ser;
    private String sub;
    private Number numDocIni;
    private Number numDocFin;
    private Number cfop;
    private LocalDate dtRef;
    private BigDecimal vlDoc;
    private BigDecimal vlDesc;
    private Number cstPis;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal vlPis;
    private Number cstCofins;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal vlCofins;
    private String codCta;
}
