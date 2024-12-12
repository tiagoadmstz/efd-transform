package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro C491: Detalhamento da Consolidação de Documentos Emitidos por ECF (Códigos 02, 2D, 59 e 60) – PIS/Pasep.
 */
@Data
public class ConsolidacaoDocEmitidosEcfPis extends AbstractEfdBlockPart {

    private final String reg = "C491";
    private String codItem;
    private Number cstPis;
    private Number cfop;
    private BigDecimal vlItem;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal quantBcPis;
    private BigDecimal aliqPisQuant;
    private BigDecimal vlPis;
    private String codCta;
}
