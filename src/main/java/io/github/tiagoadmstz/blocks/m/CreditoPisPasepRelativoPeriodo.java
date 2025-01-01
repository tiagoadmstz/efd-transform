package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M100: Crédito de PIS/PASEP Relativo ao Período.
 */
@Data
public class CreditoPisPasepRelativoPeriodo extends AbstractEfdBlockPart {

    private final String reg = "M100";
    private String codCred;
    /**
     * Indicador de Crédito Oriundo de:
     * 0 – Operações próprias;
     * 1 – Evento de incorporação, cisão ou fusão.
     */
    private String indCredOri;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal quantBcPis;
    private BigDecimal aliqPisQuant;
    private BigDecimal vlCred;
    private BigDecimal vlAjusAcres;
    private BigDecimal vlAjusReduc;
    private BigDecimal vlCredDif;
    private BigDecimal vlCredDisp;
    /**
     * Indicador de opção de utilização do crédito disponível no período:
     * 0 – Utilização do valor total para desconto da contribuição apurada no período, no Registro M200;
     * 1 – Utilização de valor parcial para desconto da contribuição apurada no período, no Registro M200.
     */
    private String indDescCred;
    /**
     * Valor do Crédito disponível, descontado da contribuição apurada no próprio período.
     * Se IND_DESC_CRED=0, informar o valor total do Campo 12;
     * Se IND_DESC_CRED=1, informar o valor parcial do Campo 12.
     */
    private BigDecimal vlCredDesc;
    private BigDecimal sldCred;
}
