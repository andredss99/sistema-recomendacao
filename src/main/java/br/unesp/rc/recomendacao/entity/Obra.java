package br.unesp.rc.recomendacao.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Obra {

    private String nome;
    private String urlPoster;
    private String pais;
    private String diretor;
    private int ano;
    private double ratingAverage;
    private ArrayList<String> generos;
}
