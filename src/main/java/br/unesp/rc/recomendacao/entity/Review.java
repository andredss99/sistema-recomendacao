package br.unesp.rc.recomendacao.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Review {

    private String dataPublicacao;
    private int idFilme;
    private int idUsuario;
    private double rating;
    private String descricao;

    public Review() {}
}
