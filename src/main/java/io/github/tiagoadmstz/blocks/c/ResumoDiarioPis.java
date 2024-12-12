package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro C481: Resumo Diário de Documentos Emitidos por ECF–PIS/Pasep (Código 02 e 2D).
 */
@Data
public class ResumoDiarioPis extends AbstractEfdBlockPart {

    private final String reg = "C481";
    private Number cstPis;
    private BigDecimal vlItem;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal quantBcPis;
    private BigDecimal aliqPisQuant;
    private BigDecimal vlPis;
    private String codItem;
    private String codCta;
}
