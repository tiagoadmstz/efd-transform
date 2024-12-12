package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;

/**
 * Registro C198: Processo Referenciado.
 */
public class OperacaoAquisicaoProcReferenciado extends AbstractEfdBlockPart {

    private final String reg = "C198";
    private String numProc;
    /**
     * Indicador da origem do processo:
     * 1 - Justiça Federal;
     * 3 – Secretaria da Receita Federal do Brasil;
     * 9 – Outros.
     */
    private String indProc;
}
