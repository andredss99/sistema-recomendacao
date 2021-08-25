package br.unesp.rc.recomendacao.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.BasicQuery;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode

@Document(collection = "films")
public class Obra {

    @Id
    private int id;
    private String title;
    private List<Genero> genres;
    private String sinopsis;
    private String poster;
    private String directorName;
    private double rating;
    private int year;
    private List<Review> reviews;
}
