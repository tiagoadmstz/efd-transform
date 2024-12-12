package io.github.tiagoadmstz.blocks.zero;

import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;

/**
 * Registro 0150: Tabela de Cadastro do Participante.
 */
@Data
public class CadastroParticipante extends AbstractEfdBlockPart {

    private final String reg = "0150";
    private String codPart;
    private String nome;
    private Number codPais;
    private Number cnpj;
    private Number cpf;
    private String ie;
    private Number codMun;
    private String suframa;
    private String end;
    private String num;
    private String compl;
    private String bairro;
}
