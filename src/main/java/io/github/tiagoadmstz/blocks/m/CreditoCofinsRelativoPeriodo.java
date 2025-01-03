package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M500: Crédito de COFINS Relativo ao Período.
 */
@Data
public class CreditoCofinsRelativoPeriodo extends AbstractEfdBlockPart {

    private final String reg = "M500";
    private String codCred;
    /**
     * Indicador de Crédito Oriundo de:
     * 0 – Operações próprias;
     * 1 – Evento de incorporação, cisão ou fusão.
     */
    private Integer indCredOri;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal quantBcCofins;
    private BigDecimal aliqCofinsQuant;
    private BigDecimal vlCred;
    private BigDecimal vlAjusAcres;
    private BigDecimal vlAjusReduc;
    private BigDecimal vlCredDifer;
    private BigDecimal vlCredDisp;
    /**
     * Indicador de utilização do crédito disponível no período:
     * 0 – Utilização do valor total para desconto da contribuição apurada no período, no Registro M600;
     * 1 – Utilização de valor parcial para desconto da contribuição apurada no período, no Registro M600.
     */
    private Integer indDescCred;
    /**
     * Valor do Crédito disponível, descontado da contribuição apurada no próprio período.
     * Se IND_DESC_CRED=0, informar o valor total do Campo 12;
     * Se IND_DESC_CRED=1, informar o valor parcial do Campo 12.
     */
    private BigDecimal vlCredDesc;
    private BigDecimal sldCred;
}
