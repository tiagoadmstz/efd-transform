package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M700: COFINS Diferida em Períodos Anteriores – Valores a Pagar no Período.
 */
@Data
public class CofinsDiferidaValoresPagarPeriodo extends AbstractEfdBlockPart {

    private final String reg = "M700";
    private String codCont;
    private BigDecimal vlContApurDifer;
    /**
     * Natureza do Crédito Diferido, vinculado à receita tributada no mercado interno, a descontar:
     * 01 – Crédito a Alíquota Básica;
     * 02 – Crédito a Alíquota Diferenciada;
     * 03 – Crédito a Alíquota por Unidade de Produto;
     * 04 – Crédito Presumido da Agroindústria.
     */
    private String natCredDesc;
    private BigDecimal vlCredDescDifer;
    private BigDecimal vlContDiferAnt;
    private String perApur;
    private String dtReceb;
}
