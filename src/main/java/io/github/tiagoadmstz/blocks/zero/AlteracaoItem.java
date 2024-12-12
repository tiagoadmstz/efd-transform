package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.time.LocalDate;

/**
 * Registro 0205: Alteração do Item.
 */
@Data
public class AlteracaoItem extends AbstractEfdBlockPart {

    private final String reg = "0205";
    private String descrAntItem;
    private LocalDate dtIni;
    private LocalDate dtFim;
    private String codAntItem;
}
