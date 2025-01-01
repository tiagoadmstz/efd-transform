package io.github.tiagoadmstz.blocks.one;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro 1501: Apuração de Crédito Extemporâneo - Documentos e Operações de Períodos Anteriores – COFINS.
 */
@Data
public class ApuracaoCrediExtempDocOpCofins extends AbstractEfdBlockPart {

    private final String reg = "1501";
    private String codPart;
    private String codItem;
    private String codMod;
    private String ser;
    private String subSer;
    private Integer numDoc;
    private String dtOper;
    private String chvNfe;
    private BigDecimal vlOper;
    private String cfop;
    private String natBcCred;
    private String indOrigCred;
    private String cstCofins;
    private BigDecimal vlBcCofins;
    private BigDecimal aliqCofins;
    private BigDecimal vlCofins;
    private String codCta;
    private String codCcus;
    private String descCompl;
    private String perEscrit;
    private String cnpj;
}
