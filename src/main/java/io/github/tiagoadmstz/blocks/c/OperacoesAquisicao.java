package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro C190: Consolidação de Notas Fiscais Eletrônicas (Código 55) – Operações de Aquisição com Direito a Crédito, e Operações de Devolução de Compras e Vendas.
 */
@Data
public class OperacoesAquisicao extends AbstractEfdBlockPart {

    private final String reg = "C190";
    /**
     * Texto fixo contendo "55" (Código da Nota Fiscal Eletrônica, modelo 55, conforme a Tabela 4.1.1).
     */
    private String codMod = "55";
    private LocalDate dtDocIni;
    private LocalDate dtDocFin;
    private String codItem;
    private String codNcm;
    private String exIpi;
    private BigDecimal vlTotItem;
}
