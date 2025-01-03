package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M400: Receitas Isentas, Não Alcançadas pela Incidência da Contribuição, Sujeitas à Alíquota Zero ou de Vendas com Suspensão – PIS/PASEP.
 */
@Data
public class ReceitasIsentasContribZeroPis extends AbstractEfdBlockPart {

    private final String reg = "M400";
    private String cstPis;
    private BigDecimal vlTotRec;
    private String codCta;
    private String descCompl;
}
