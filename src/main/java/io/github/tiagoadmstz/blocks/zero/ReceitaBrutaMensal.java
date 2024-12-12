package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 0111: Tabela de Receita Bruta Mensal Para Fins de Rateio de Créditos Comuns
 */
@Data
public class ReceitaBrutaMensal extends AbstractEfdBlockPart {

    private final String reg = "0111";
    private Number recBruNcumTribM;
    private Number recBruNcumNtMi;
    private Number recBruNcumExp;
    private Number recBruCum;
    private Number recBruTotal;
}
