package io.github.tiagoadmstz.blocks.f;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro F200: Operações da Atividade Imobiliária - Unidade Imobiliária Vendida.
 */
@Data
public class OpAtividadeImobUnidadeImobVendida extends AbstractEfdBlockPart {

    private final String reg = "F200";
    /**
     * Indicador do Tipo da Operação:
     * 01 – Venda a Vista de Unidade Concluída;
     * 02 – Venda a Prazo de Unidade Concluída;
     * 03 – Venda a Vista de Unidade em Construção;
     * 04 – Venda a Prazo de Unidade em Construção;
     * 05 – Outras.
     */
    private String indOper;
    /**
     * Indicador do tipo de unidade imobiliária Vendida:
     * 01 – Terreno adquirido para venda;
     * 02 – Terreno decorrente de loteamento;
     * 03 – Lote oriundo de desmembramento de terreno;
     * 04 – Unidade resultante de incorporação imobiliária;
     * 05 – Prédio construído/em construção para venda;
     * 06 – Outras.
     */
    private String unidImob;
    private String identEmp;
    private String descUnidImob;
    private String numCont;
    private String cpfCnpjAdqu;
    private String dtOper;
    private BigDecimal vlTotVend;
    private BigDecimal vlRecAcum;
    private BigDecimal vlTotRec;
    private Number cstPis;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal vlPis;
    private Number cstCofins;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal vlCofins;
    private BigDecimal percRecReceb;
    /**
     * Indicador da Natureza Específica do Empreendimento:
     * 1 - Consórcio;
     * 2 - SCP;
     * 3 – Incorporação em Condomínio;
     * 4 - Outras.
     */
    private String indNatEmp;
    private String infComp;
}
