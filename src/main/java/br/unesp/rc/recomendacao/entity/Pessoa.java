package br.unesp.rc.recomendacao.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Pessoa {

    private String nome;
    private String pais;
    private String urlFoto;
    private String dataNasc;

    public Pessoa() {}
}
