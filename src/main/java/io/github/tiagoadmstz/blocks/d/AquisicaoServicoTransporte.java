package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro D100: Aquisição de Serviços de Transporte - Nota Fiscal de Serviço de Transporte (Código 07), Conhecimento de Transporte Rodoviário de Cargas (Código 08), Conhecimento de Transporte de Cargas Avulso (Código 8B), Conhecimento de Transporte Aquaviário de Cargas (Código 09), Conhecimento de Transporte Aéreo (Código 10), Conhecimento de Transporte Ferroviário de Cargas (Código 11), Conhecimento de Transporte Multimodal de Cargas (Código 26), Nota Fiscal de Transporte Ferroviário de Carga (Código 27), Conhecimento de Transporte Eletrônico – CT-E (Código 57), Bilhete de Passagem Eletrônico - BP-e (Código 63) e Conhecimento de Transporte Eletrônico para Outros Serviços – CT-e OS, modelo 67.
 */
@Data
public class AquisicaoServicoTransporte extends AbstractEfdBlockPart {

    private final String reg = "D100";
    /**
     * Indicador do tipo de operação:
     * 0- Aquisição
     */
    private String indOper;
    /**
     * Indicador do emitente do documento fiscal:
     * 0- Emissão Própria;
     * 1- Emissão por Terceiros.
     */
    private String indEmit;
    private String codPart;
    private String codMod;
    private Number codSit;
    private String ser;
    private String sub;
    private Number numDoc;
    private Number chvCte;
    private LocalDate dtDoc;
    private LocalDate dtAP;
    private Number tpCte;
    private Number chvCteRef;
    private BigDecimal vlDoc;
    private BigDecimal vlDesc;
    /**
     * Indicador do tipo do frete:
     * 0- Por conta de terceiros;
     * 1- Por conta do emitente;
     * 2- Por conta do destinatário;
     * 9- Sem cobrança de frete.
     * Obs.: A partir de 01/07/2012 passará a ser:
     * Indicador do tipo do frete:
     * 0- Por conta do emitente;
     * 1- Por conta do destinatário/remetente;
     * 2- Por conta de terceiros;
     * 9- Sem cobrança de frete.
     */
    private String indFrt;
    private BigDecimal vlServ;
    private BigDecimal vlBcIcms;
    private BigDecimal vlIcms;
    private BigDecimal vlNt;
    private String codInf;
    private String codCta;
}
