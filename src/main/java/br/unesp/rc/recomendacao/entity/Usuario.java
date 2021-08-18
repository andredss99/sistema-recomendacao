package br.unesp.rc.recomendacao.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Document(collection = "usuario")
public class Usuario {

    @Id
    private String email;
    private String nome;
    private String senha;

    public Usuario() {}
}
