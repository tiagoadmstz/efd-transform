package io.github.tiagoadmstz.blocks.a;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro A120: Informação Complementar - Operações de Importação.
 */
@Data
public class OperacoesImportacao extends AbstractEfdBlockPart {

    private final String reg = "A120";
    private BigDecimal vlTotServ;
    private BigDecimal vlBcPis;
    private BigDecimal vlPisImp;
    private LocalDate dtPagPis;
    private BigDecimal vlBcCofins;
    private BigDecimal vlCofinsImp;
    private LocalDate dtPagCofins;
    /**
     * Local da execução do serviço:
     * 0 – Executado no País;
     * 1 – Executado no Exterior, cujo resultado se verifique no País.
     */
    private String locExeServ;
}
