package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M225: Detalhamento dos Ajustes da Contribuição para o PIS/Pasep Apurada.
 */
@Data
public class DetAjustesContribuicaoPisApurada extends AbstractEfdBlockPart {

    private final String reg = "M225";
    private BigDecimal detValorAj;
    private String cstPis;
    private BigDecimal detBcCred;
    private BigDecimal detAliq;
    private String dtOperAj;
    private String descAj;
    private String codCta;
    private String infoCompl;
}
