package io.github.tiagoadmstz.blocks.c;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro C010: Identificação do Estabelecimento.
 */
@Data
public class IdentificacaoEstabelecimentoC extends AbstractEfdBlockPart {

    private final String reg = "C010";
    private Number cnpj;
    /**
     * Indicador da apuração das contribuições e créditos, na escrituração das operações por NF-e e ECF, no período:
     * 1 – Apuração com base nos registros de consolidação das operações por NF-e (C180 e C190) e por ECF (C490);
     * 2 – Apuração com base no registro individualizado de NF-e (C100 e C170) e de ECF (C400).
     */
    private String indEscri;
}
