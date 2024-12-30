package io.github.tiagoadmstz.blocks.i;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro I200: Composição das Receitas, Deduções e/ou Exclusões do Período.
 */
@Data
public class CompReceitasDeducoesExclusoesPeriodo extends AbstractEfdBlockPart {

    private final String reg = "I200";
    private String numCampo;
    private String codDet;
    private String detValor;
    private String codCta;
    private String infoCompl;
}
