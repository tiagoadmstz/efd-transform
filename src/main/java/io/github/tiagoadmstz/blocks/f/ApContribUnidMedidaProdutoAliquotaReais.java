package io.github.tiagoadmstz.blocks.f;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;

import java.math.BigDecimal;

/**
 * Registro F510: Consolidação das Operações da Pessoa Jurídica Submetida ao Regime de Tributação Com Base no Lucro Presumido – Incidência do PIS/Pasep e da Cofins pelo Regime de Caixa (Apuração da Contribuição por Unidade de Medida de Produto – Alíquota em Reais).
 */
public class ApContribUnidMedidaProdutoAliquotaReais extends AbstractEfdBlockPart {

    private final String reg = "F510";
    private BigDecimal vlRecCaixa;
    private Number cstPis;
    private BigDecimal vlDescPis;
    private BigDecimal quantBcPis;
    private BigDecimal aliqPisQuant;
    private BigDecimal vlPis;
    private Number cstCofins;
    private BigDecimal vlDescCofins;
    private BigDecimal quantBcCofins;
    private BigDecimal aliqCofinsQuant;
    private BigDecimal vlCofins;
    private String codMod;
    private String cfop;
    private String codCta;
    private String infoCompl;
}
