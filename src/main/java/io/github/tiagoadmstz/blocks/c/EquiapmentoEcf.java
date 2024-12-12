package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro C400: Equipamento ECF (Códigos 02 e 2D).
 */
@Data
public class EquiapmentoEcf extends AbstractEfdBlockPart {

    private final String reg = "C400";
    private String codMod;
    private String ecfMod;
    private String ecfFab;
    private Number ecfCx;
}
