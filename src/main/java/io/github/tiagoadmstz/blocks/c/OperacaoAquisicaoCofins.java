package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro C195: Detalhamento da Consolidação - Operações de Aquisição Com Direito a Crédito, e Operações de Devolução de Compras e Vendas – Cofins.
 */
@Data
public class OperacaoAquisicaoCofins extends AbstractEfdBlockPart {

    private final String reg = "C195";
    private String cnpjCpfPart;
    private Number cstCofins;
    private Number cfop;
    private BigDecimal vlItem;
    private BigDecimal vlDesc;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal quantBcCofins;
    private BigDecimal aliqCofinsQuant;
    private BigDecimal vlCofins;
    private String codCta;
}
