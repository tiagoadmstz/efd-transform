package io.github.tiagoadmstz.blocks.one;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro 1101: Apuração de Crédito Extemporâneo - Documentos e Operações de Períodos Anteriores – PIS/PASEP.
 */
@Data
public class ApuracaoCredExtemporaneoDocOpPis extends AbstractEfdBlockPart {

    private final String reg = "1101";
    private String codPart;
    private String codItem;
    private String codMod;
    private String ser;
    private String subSer;
    private Long numDoc;
    private String dtOper;
    private String chvNfe;
    private BigDecimal vlOper;
    private String cfop;
    private String natBcCred;
    private Integer indOrigCred;
    private String cstPis;
    private BigDecimal vlBcPis;
    private BigDecimal aliqPis;
    private BigDecimal vlPis;
    private String codCta;
    private String codCcus;
    private String descCompl;
    private String perEscrit;
    private String cnpj;
}
