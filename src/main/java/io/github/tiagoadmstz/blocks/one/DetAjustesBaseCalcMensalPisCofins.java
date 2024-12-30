package io.github.tiagoadmstz.blocks.one;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 1050: Detalhamento de Ajustes de Base de Cálculo – Valores Extra Apuração.
 */
@Data
public class DetAjustesBaseCalcMensalPisCofins extends AbstractEfdBlockPart {

    private final String reg = "1050";
    private String dtRef;
    private String indAjBc;
    private String cnpj;
    private Double vlAjTot;
    private Double vlAjCst01;
    private Double vlAjCst02;
    private Double vlAjCst03;
    private Double vlAjCst04;
    private Double vlAjCst05;
    private Double vlAjCst06;
    private Double vlAjCst07;
    private Double vlAjCst08;
    private Double vlAjCst09;
    private Double vlAjCst49;
    private Double vlAjCst99;
    private String indAprop;
    private String numRec;
    private String infoCompl;
}
