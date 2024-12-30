package io.github.tiagoadmstz.blocks.f;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro F550: Consolidação das Operações da Pessoa Jurídica Submetida ao Regime de Tributação com Base no Lucro Presumido – Incidência do PIS/Pasep e da Cofins pelo Regime de Competência.
 */
@Data
public class BaseLucroPresIncPisCofinsRegCompet extends AbstractEfdBlockPart {

    private final String reg = "F550";
    private BigDecimal vlRecComp;
    private Number cstPis;
    private BigDecimal vlDescPis;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal vlPis;
    private Number cstCofins;
    private BigDecimal vlDescCofins;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal vlCofins;
    private String codMod;
    private String cfop;
    private String codCta;
    private String infoCompl;
}
