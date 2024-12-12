package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 0110: Regimes de Apuração da Contribuição Social e de Apropriação de Crédito
 */
@Data
public class RegimesApuracaoContribuicaoSocial extends AbstractEfdBlockPart {

    private final String reg = "0110";
    /**
     * Código indicador da incidência tributária no período:
     * 1 – Escrituração de operações com incidência exclusivamente no regime não-cumulativo;
     * 2 – Escrituração de operações com incidência exclusivamente no regime cumulativo;
     * 3 – Escrituração de operações com incidência nos regimes não-cumulativo e cumulativo.
     */
    private Number codIncTirb;
    /**
     * Código indicador de método de apropriação de créditos comuns, no caso de incidência no regime não-cumulativo (COD_INC_TRIB = 1 ou 3):
     * 1 – Método de Apropriação Direta;
     * 2 – Método de Rateio Proporcional (Receita Bruta)
     */
    private Number indAprovCred;
    /**
     * Código indicador do Tipo de Contribuição Apurada no Período
     * 1 – Apuração da Contribuição Exclusivamente a Alíquota Básica
     * 2 – Apuração da Contribuição a Alíquotas Específicas (Diferenciadas e/ou por Unidade de Medida de Produto)
     */
    private Number codTipoCont;
    /**
     * Código indicador do critério de escrituração e apuração adotado, no caso de incidência exclusivamente no regime cumulativo (COD_INC_TRIB = 2), pela pessoa jurídica submetida ao regime de tributação com base no lucro presumido:
     * 1 – Regime de Caixa – Escrituração consolidada (Registro F500);
     * 2 – Regime de Competência - Escrituração consolidada (Registro F550);
     * 9 – Regime de Competência - Escrituração detalhada, com base nos registros dos Blocos “A”, “C”, “D” e “F”.
     */
    private Number indRegCum;
}
