package br.unesp.rc.recomendacao.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Obra {

    private int id;
    private String title;
    private String poster;
    private String pais;
    private String directorName;
    private int year;
    private double rating;
    private String sinopsis;
    private List<Review> reviews;
    private List<String> generos;
}
