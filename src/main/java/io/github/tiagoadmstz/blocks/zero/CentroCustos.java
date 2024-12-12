package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.time.LocalDate;

/**
 * Registro 0600: Centro de Custos.
 */
@Data
public class CentroCustos extends AbstractEfdBlockPart {

    private final String reg = "0600";
    private LocalDate dtAlt;
    private String codCcus;
    private String ccus;
}
