package io.github.tiagoadmstz.blocks.p;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro P110: Complemento da Escrituração – Detalhamento da Apuração da Contribuição.
 */
@Data
public class CompEscrDetApuracaoContribuicao extends AbstractEfdBlockPart {

    private final String reg = "P110";
    private String numCampo;
    private String codDet;
    private String detValor;
    private String infCompl;
}
