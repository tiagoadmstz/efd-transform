package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

// Registro 0200: Tabela de Cadastro do Participante
@Data
public class IdentificacaoItem extends AbstractEfdBlockPart {

    private final String reg = "0200";
    private String codPart;
    private String nome;
    private String cpfCnpj;
    private String ie;
    private String endereco;
    private String cidade;
    private String uf;
}
