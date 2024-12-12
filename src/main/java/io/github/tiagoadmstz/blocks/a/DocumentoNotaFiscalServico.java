package io.github.tiagoadmstz.blocks.a;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro A100: Documento - Nota Fiscal de Serviço.
 */
@Data
public class DocumentoNotaFiscalServico extends AbstractEfdBlockPart {

    private final String reg = "A100";
    /**
     * Indicador do tipo de operação:
     * 0 - Serviço Contratado pelo Estabelecimento;
     * 1 - Serviço Prestado pelo Estabelecimento.
     */
    private String indOper;
    /**
     * Indicador do emitente do documento fiscal:
     * 0 - Emissão Própria;
     * 1 - Emissão de Terceiros
     */
    private String indEmit;
    private String codPart;
    /**
     * Código da situação do documento fiscal:
     * 00 – Documento regular
     * 02 – Documento cancelado
     */
    private String codSit;
    private String ser;
    private String sub;
    private String numDoc;
    private String chvNfse;
    private LocalDate dtDoc;
    private LocalDate dtExeServ;
    private BigDecimal vlDoc;
    /**
     * Indicador do tipo de pagamento:
     * 0- À vista;
     * 1- A prazo;
     * 9- Sem pagamento.
     */
    private String indPgto;
    private BigDecimal vlDesc;
    private BigDecimal vlBcPis;
    private BigDecimal vlPis;
    private BigDecimal vlBcCofins;
    private BigDecimal vlCofins;
    private BigDecimal vlPisRet;
    private BigDecimal vlCofinsRet;
    private BigDecimal vlIss;
}
