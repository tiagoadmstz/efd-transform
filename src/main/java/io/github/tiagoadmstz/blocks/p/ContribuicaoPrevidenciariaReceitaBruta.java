package io.github.tiagoadmstz.blocks.p;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro P100: Contribuição Previdenciária sobre a Receita Bruta.
 */
@Data
public class ContribuicaoPrevidenciariaReceitaBruta extends AbstractEfdBlockPart {

    private final String reg = "P100";
    private String dtIni;
    private String dtFin;
    private String vlRecTotEst;
    private String codAtivEcon;
    private String vlRecAtivEstab;
    private String vlExc;
    private String vlBcCont;
    private String aliquota;
    private String vlContApu;
    private String codCta;
    private String infoCompl;
}
