package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

// 0100: Dados do Contabilista
@Data
public class DadosContabilista extends AbstractEfdBlockPart {

    private final String reg = "0100";
    private String nome;
    private Number cpf;
    private String crc;
    private Number cnpj;
    private Number cep;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String fone;
    private String fax;
    private String email;
    private Number codMun;
}
