package io.github.tiagoadmstz.blocks.nine;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 9999: Encerramento de Arquivo Digital.
 */
@Data
public class EncerramentoArquivoDigital extends AbstractEfdBlockPart {

    private final String reg = "9999";
    private String qtdLinArquivo;
}
