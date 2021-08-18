package br.unesp.rc.recomendacao.dto;

import br.unesp.rc.recomendacao.entity.Usuario;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UsuarioDTO {

    private String email;
    private String nome;
    private String senha;

    public UsuarioDTO(String email, String nome, String senha) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }
}
