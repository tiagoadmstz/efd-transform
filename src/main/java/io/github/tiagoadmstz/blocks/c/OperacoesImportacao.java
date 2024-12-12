package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro C120: Complemento do Documento - Operações de Importação (Código 01).
 */
@Data
public class OperacoesImportacao extends AbstractEfdBlockPart {

    private final String reg = "C120";
    /**
     * Documento de importação:
     * 0 – Declaração de Importação;
     * 1 – Declaração Simplificada de Importação;
     * --------
     * A partir dos fatos geradores ocorridos em 01/2019:
     * Documento de importação:
     * 0 – Declaração de Importação;
     * 1 – Declaração Simplificada de Importação;
     * 2 – Declaração Única de Importação
     */
    private String codDocImp;
    private String numDocImp;
    private BigDecimal vlPisImp;
    private BigDecimal vlCofinsImp;
    private String numAcdraw;
}
