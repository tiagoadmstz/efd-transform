package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M230: Informações Adicionais de Diferimento.
 */
@Data
public class InformacoesAdicionaisDiferimento extends AbstractEfdBlockPart {

    private final String reg = "M230";
    private String cnpj;
    private BigDecimal vlVend;
    private BigDecimal vlNaoReceb;
    private BigDecimal vlContDif;
    private BigDecimal vlCredDif;
    private String codCred;
}
