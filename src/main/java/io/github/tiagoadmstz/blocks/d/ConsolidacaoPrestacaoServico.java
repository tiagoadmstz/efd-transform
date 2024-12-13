package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro D600: Consolidação da Prestação de Serviços - Notas de Serviço de Comunicação (Código 21) e de Serviço de Telecomunicação (Código 22).
 */
@Data
public class ConsolidacaoPrestacaoServico extends AbstractEfdBlockPart {

    private final String reg = "D600";
    private String codMod;
    private Number codMun;
    private String ser;
    private Number sub;
    /**
     * Indicador do tipo de receita:
     * 0- Receita própria - serviços prestados;
     * 1- Receita própria - cobrança de débitos;
     * 2- Receita própria - venda de serviço pré-pago – faturamento de períodos anteriores;
     * 3- Receita própria - venda de serviço pré-pago – faturamento no período;
     * 4- Outras receitas próprias de serviços de comunicação e telecomunicação;
     * 5- Receita própria - co-faturamento;
     * 6- Receita própria – serviços a faturar em período futuro;
     * 7– Outras receitas próprias de natureza não-cumulativa;
     * 8 - Outras receitas de terceiros
     * 9 – Outras receitas.
     */
    private Number indRec;
    private Number qtdCons;
    private LocalDate dtDocIni;
    private LocalDate dtDocFin;
    private BigDecimal vlDoc;
    private BigDecimal vlDesc;
    private BigDecimal vlServ;
    private BigDecimal vlServNt;
    private BigDecimal vlTerc;
    private BigDecimal vlDa;
    private BigDecimal vlBcIcms;
    private BigDecimal vlIcms;
    private BigDecimal vlPis;
    private BigDecimal vlCofins;
}
