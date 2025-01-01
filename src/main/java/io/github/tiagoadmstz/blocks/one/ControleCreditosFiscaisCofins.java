package io.github.tiagoadmstz.blocks.one;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro 1500: Controle de Créditos Fiscais – COFINS.
 */
@Data
public class ControleCreditosFiscaisCofins extends AbstractEfdBlockPart {

    private final String reg = "1500";
    private String perApuCred;
    private String origCred;
    private String cnpjSuc;
    private String codCred;
    private BigDecimal vlCredApu;
    private BigDecimal vlCredExtApu;
    private BigDecimal vlTotCredApu;
    private BigDecimal vlCredDescPaAnt;
    private BigDecimal vlCredPerPaAnt;
    private BigDecimal vlCredDcompPaAnt;
    private BigDecimal sdCredDispEfd;
    private BigDecimal vlCredDescEfd;
    private BigDecimal vlCredPerEfd;
    private BigDecimal vlCredDcompEfd;
    private BigDecimal vlCredTrans;
    private BigDecimal vlCredOut;
    private BigDecimal sldCredFim;
}
