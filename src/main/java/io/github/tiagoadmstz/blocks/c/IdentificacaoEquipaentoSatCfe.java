package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.time.LocalDate;

/**
 * Registro C860: Identificação do Equipamento SAT-CF-e.
 */
@Data
public class IdentificacaoEquipaentoSatCfe extends AbstractEfdBlockPart {

    private final String reg = "C860";
    private String codMod;
    private Number nrSat;
    private LocalDate dtDoc;
    private Number docIni;
    private Number docFim;
}
