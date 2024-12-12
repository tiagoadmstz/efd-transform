package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro C188: Processo Referenciado.
 */
@Data
public class OperacaoVendasProcReferenciado extends AbstractEfdBlockPart {

    private final String reg = "C188";
    private String numProc;
    private String cfop;
}
