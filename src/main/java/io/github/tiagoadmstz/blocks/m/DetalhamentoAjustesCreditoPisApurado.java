package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M115: Detalhamento dos Ajustes do Crédito de Pis/Pasep Apurado.
 */
@Data
public class DetalhamentoAjustesCreditoPisApurado extends AbstractEfdBlockPart {

    private final String reg = "M115";
    private BigDecimal detValorAj;
    private String cstPis;
    private BigDecimal detBcCred;
    private BigDecimal detAliq;
    private String dtOperAj;
    private String descAj;
    private String codCta;
    private String infoCompl;
}
