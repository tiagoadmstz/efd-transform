package io.github.tiagoadmstz.blocks.f;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Registro F525: Composição da Receita Escriturada no Período – Detalhamento da Receita Recebida pelo Regime de Caixa.
 */
@Data
public class DetalhamentoReceitaRecebidaRegimeCaixa extends AbstractEfdBlockPart {

    private final String reg = "F525";
    private BigDecimal vlRec;
    private String indRec;
    private String cnpjCpf;
    private String numDoc;
    private String codItem;
    private BigDecimal vlRecDet;
    private Number cstPis;
    private Number cstCofins;
    private String infoCompl;
    private String codCta;
}
