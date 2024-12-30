package io.github.tiagoadmstz.blocks.i;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro I300: Complemento das Operações – Detalhamento das Receitas, Deduções e/ou Exclusões Do Período.
 */
@Data
public class ComplOpDetReceitasDeducoesExclPer extends AbstractEfdBlockPart {

    private final String reg = "I300";
    private String codComp;
    private String detValor;
    private String codCta;
    private String infoCompl;
}
