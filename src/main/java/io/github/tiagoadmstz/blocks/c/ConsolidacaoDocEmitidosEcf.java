package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.time.LocalDate;

/**
 * Registro C490: Consolidação de Documentos Emitidos por ECF (Códigos 02, 2D, 59 e 60).
 */
@Data
public class ConsolidacaoDocEmitidosEcf extends AbstractEfdBlockPart {

    private final String reg = "C490";
    private LocalDate dtDocIni;
    private LocalDate dtDocFin;
    private String codMod;
}
