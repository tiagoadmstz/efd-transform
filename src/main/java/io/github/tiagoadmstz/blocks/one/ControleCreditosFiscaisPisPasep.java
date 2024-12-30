package io.github.tiagoadmstz.blocks.one;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 1100: Controle de Créditos Fiscais – PIS/PASEP.
 */
@Data
public class ControleCreditosFiscaisPisPasep extends AbstractEfdBlockPart {

    private final String reg = "1100";
    private String perApuCred;
    private String origCred;
    private String cnpjSuc;
    private String codCred;
    private Double vlCredApu;
    private Double vlCredExtApu;
    private Double vlTotCredApu;
    private Double vlCredDescPaAnt;
    private Double vlCredPerPaAnt;
    private Double vlCredDcompPaAnt;
    private Double sdCredDispEfd;
    private Double vlCredDescEfd;
    private Double vlCredPerEfd;
    private Double vlCredDcompEfd;
    private Double vlCredTrans;
    private Double vlCredOut;
    private Double sldCredFim;
}
