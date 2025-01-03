package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M515: Detalhamento dos Ajustes do Crédito de Cofins Apurado.
 */
@Data
public class DetalhamentoAjustesCreditoCofinsApurado extends AbstractEfdBlockPart {

    private final String reg = "M515";
    private BigDecimal detValorAj;
    private String cstCofins;
    private BigDecimal detBcCred;
    private BigDecimal detAliq;
    private String dtOperAj;
    private String descAj;
    private String codCta;
    private String infoCompl;
}
