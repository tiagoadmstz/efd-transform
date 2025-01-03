package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M810: Detalhamento das Receitas Isentas, Não Alcançadas pela Incidência da Contribuição, Sujeitas a Alíquota Zero ou de Vendas com Suspensão – Cofins.
 */
@Data
public class DetalhamReceitasIsentasAliquotaZeroCofins extends AbstractEfdBlockPart {

    private final String reg = "M810";
    private String natRec;
    private BigDecimal vlRec;
    private String codCta;
    private String descCompl;
}
