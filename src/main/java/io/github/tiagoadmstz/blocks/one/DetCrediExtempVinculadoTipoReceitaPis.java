package io.github.tiagoadmstz.blocks.one;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro 1102: Detalhamento do Crédito Extemporâneo, Vinculado a mais de um Tipo de Receita – PIS/PASEP
 */
@Data
public class DetCrediExtempVinculadoTipoReceitaPis extends AbstractEfdBlockPart {

    private final String reg = "1102";
    private BigDecimal vlCredPisTribMi;
    private BigDecimal vlCredPisNtMi;
    private BigDecimal vlCredPisExp;
}
