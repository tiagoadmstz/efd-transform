package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro C191: Detalhamento da Consolidação – Operações de Aquisição Com Direito a Crédito, e Operações de Devolução de Compras e Vendas – PIS/Pasep.
 */
@Data
public class OperacaoAquisicaoPisPasep extends AbstractEfdBlockPart {

    private final String reg = "C191";
    private String cnpjCpfPart;
    private Number cstPis;
    private Number cfop;
    private BigDecimal vlItem;
    private BigDecimal vlDesc;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal quantBcPis;
    private BigDecimal aliqPisQuant;
    private BigDecimal vlPis;
    private String codCta;
}
