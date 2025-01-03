package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M625: Detalhamento dos Ajustes da Cofins Apurada.
 */
@Data
public class DetalhamentoAjustesCofinsApurada extends AbstractEfdBlockPart {

    private final String reg = "M625";
    private BigDecimal detValorAj;
    private String cstCofins;
    private BigDecimal detBcCred;
    private BigDecimal detAliq;
    private String dtOperAj;
    private String descAj;
    private String codCta;
    private String infoCompl;
}
