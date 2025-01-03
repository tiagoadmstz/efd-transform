package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M630: Informações Adicionais de Diferimento.
 */
@Data
public class ConsContribSeguridadeSocialCofinsInfoAdic extends AbstractEfdBlockPart {

    private final String reg = "M630";
    private String cnpj;
    private BigDecimal vlVend;
    private BigDecimal vlNaoReceb;
    private BigDecimal vlContDif;
    private BigDecimal vlCredDif;
    private String codCred;
}
