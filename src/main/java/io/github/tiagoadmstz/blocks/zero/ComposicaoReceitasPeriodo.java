package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 0900: Composição das Receitas do Período – Receita Bruta e Demais Receitas.
 */
@Data
public class ComposicaoReceitasPeriodo extends AbstractEfdBlockPart {

    private final String reg = "0900";
    private Number recTotalBlocoA;
    private Number recNrbBlocoA;
    private Number recTotalBlocoC;
    private Number recNrbBlocoC;
    private Number recTotalBlocoD;
    private Number recNrbBlocoD;
    private Number recTotalBlocoF;
    private Number recNrbBlocoF;
    private Number recTotalBlocoI;
    private Number recNrbBlocoI;
    private Number recTotalBloco1;
    private Number recNrbBloco1;
    private Number recTotalPeriodo;
    private Number recTotalNrbPeriodo;
}
