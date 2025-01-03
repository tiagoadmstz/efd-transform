package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M103: Detalhamento da Base de Cálculo do Crédito Apurado no Período – PIS/PASEP.
 */
@Data
public class DetBaseCalculoCredApuradoPisPasep extends AbstractEfdBlockPart {

    private final String reg = "M105";
    private String natBcCred;
    private String cstPis;
    private BigDecimal vlBcPisTot;
    private BigDecimal vlBcPisCum;
    private BigDecimal vlBcPisNc;
    private BigDecimal vlBcPis;
    private Number quantBcPisTot;
    private Number quantBcPis;
    private String descCred;
}
