package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;

/**
 * Registro 0145: Regime de Apuração da Contribuição Previdenciária Sobre a Receita Bruta;
 */
public class RegimeApuracaoCPSRB extends AbstractEfdBlockPart {

    private final String reg = "0145";
    private Number codIncTrib;
    private Number vlRecTotal;
    private Number vlRecAtiv;
    private Number vlRecDemaisAtiv;
    private String infoCompl;
}
