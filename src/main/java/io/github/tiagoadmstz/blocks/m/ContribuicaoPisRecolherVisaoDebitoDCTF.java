package io.github.tiagoadmstz.blocks.m;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro M205: Contribuição para o PIS/Pasep a Recolher – Detalhamento por Código de Receita (Visão Débito DCTF).
 */
@Data
public class ContribuicaoPisRecolherVisaoDebitoDCTF extends AbstractEfdBlockPart {

    private final String reg = "M205";
    private String numCampo;
    private String codRec;
    private BigDecimal vlDebito;
}
