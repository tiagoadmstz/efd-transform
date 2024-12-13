package io.github.tiagoadmstz.blocks.d;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Registro D200: Resumo da Escrituração Diária – Prestação de Serviços de Transporte: Nota Fiscal de Serviço de Transporte (Código 07), Conhecimento de Transporte Rodoviário de Cargas (Código 08), Conhecimento de Transporte de Cargas Avulso (Código 8B), Conhecimento de Transporte Aquaviário de Cargas (Código 09), Conhecimento de Transporte Aéreo (Código 10), Conhecimento de Transporte Ferroviário de Cargas (Código 11), Conhecimento de Transporte Multimodal de Cargas (Código 26), Nota Fiscal de Transporte Ferroviário de Carga (Código 27), Conhecimento de Transporte Eletrônico – CT-E (Código 57), Bilhete de Passagem Eletrônico - BP-e (Código 63) e Conhecimento de Transporte Eletrônico para Outros Serviços – CT-e OS, modelo 67.
 */
@Data
public class ResumoEscrituracaoDiaria extends AbstractEfdBlockPart {

    private final String reg = "D200";
    private String codMod;
    private Number codSit;
    private String ser;
    private String sub;
    private Number numDocIni;
    private Number numDocFin;
    private Number cfop;
    private LocalDate dtRef;
    private BigDecimal vlDoc;
    private BigDecimal vlDesc;
}
