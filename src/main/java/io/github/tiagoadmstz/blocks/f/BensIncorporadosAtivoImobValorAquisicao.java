package io.github.tiagoadmstz.blocks.f;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro F130: Bens Incorporados ao Ativo Imobilizado – Operações Geradoras de Créditos com Base no Valor de Aquisição/Contribuição.
 */
@Data
public class BensIncorporadosAtivoImobValorAquisicao extends AbstractEfdBlockPart {

    private final String reg = "F130";
    private String natBcCred;
    /**
     * Identificação dos bens ou grupo de bens incorporados ao Ativo Imobilizado:
     * 01 = Edificações e Benfeitorias;
     * 03 = Instalações;
     * 04 = Máquinas;
     * 05 = Equipamentos;
     * 06 = Veículos;
     * 99 = Outros bens incorporados ao Ativo Imobilizado.
     */
    private String identBemImob;
    /**
     * Indicador da origem do bem incorporado ao ativo imobilizado, gerador de crédito:
     * 0 – Aquisição no Mercado Interno
     * 1 – Aquisição no Mercado Externo (Importação)
     */
    private String indOrigCred;
    /**
     * Indicador da Utilização dos Bens Incorporados ao Ativo Imobilizado:
     * 1 – Produção de Bens Destinados a Venda;
     * 2 – Prestação de Serviços;
     * 3 – Locação a Terceiros;
     * 9 – Outros.
     */
    private String indUtilBemImob;
    private String mesOperAquis;
    private BigDecimal vlOperAquis;
    private BigDecimal parcOperNaoBcCred;
    private BigDecimal vlBcCred;
    /**
     * Indicador do Número de Parcelas a serem apropriadas (Crédito sobre Valor de Aquisição):
     * 1 – Integral (Mês de Aquisição);
     * 2 – 12 Meses;
     * 3 – 24 Meses;
     * 4 – 48 Meses;
     * 5 – 6 Meses (Embalagens de bebidas frias)
     * 9 – Outra periodicidade definida em Lei.
     */
    private String indNrParc;
    private Number cstPis;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal vlPis;
    private Number cstCofins;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal vlCofins;
    private String codCta;
    private String codCcus;
    private String descBemImob;
}
