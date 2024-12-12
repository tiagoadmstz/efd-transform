package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro C180: Consolidação de Notas Fiscais Eletrônicas Emitidas Pela Pessoa Jurídica (Códigos 55 e 65) – Operações de Vendas.
 */
@Data
public class ConsolidacaoNfeEmitidasPj extends AbstractEfdBlockPart {

    private final String reg = "C180";
    /**
     * Texto fixo contendo "55" ou “65”(Código da NF-e ou da NFC-e, conforme a Tabela 4.1.1).
     */
    private String codMod;
    private LocalDate dtDocIni;
    private LocalDate dtDocFin;
    private String codItem;
    private String codNcm;
    private String exIpi;
    private BigDecimal vlTotItem;
}
