package io.github.tiagoadmstz.blocks.a;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro A170: Complemento do Documento - Itens do Documento.
 */
@Data
public class ComplementoDocumentoItem extends AbstractEfdBlockPart {

    private final String reg = "A170";
    private Number numItem;
    private String codItem;
    private String descrCompl;
    private BigDecimal vlItem;
    private BigDecimal vlDesc;
    private String natBcCred;
    /**
     * Indicador da origem do crédito:
     * 0 – Operação no Mercado Interno
     * 1 – Operação de Importação
     */
    private String indOrigCred;
    private String cstPis;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal vlPis;
    private Number cstCofins;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal vlCofins;
    private String codCta;
    private String codCcus;
}
