package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M800: Receitas Isentas, Não Alcançadas pela Incidência da Contribuição, Sujeitas a Alíquota Zero ou de Vendas Com Suspensão – Cofins.
 */
@Data
public class ReceitasIsentasAliquotaZeroCofins extends AbstractEfdBlockPart {

    private final String reg = "M800";
    private String cstCofins;
    private BigDecimal vlTotRec;
    private String codCta;
    private String descCompl;
}
