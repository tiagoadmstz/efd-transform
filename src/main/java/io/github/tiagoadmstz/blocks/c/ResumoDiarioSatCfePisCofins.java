package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro C870: Resumo Diário de Documentos Emitidos por Equipamento SAT-Cf-e (Código 59) – PIS/Pasep e Cofins.
 */
@Data
public class ResumoDiarioSatCfePisCofins extends AbstractEfdBlockPart {

    private final String reg = "C870";
    private String codItem;
    private Number cfop;
    private BigDecimal vlItem;
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
