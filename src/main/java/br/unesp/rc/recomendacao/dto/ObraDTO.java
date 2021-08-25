package br.unesp.rc.recomendacao.dto;

import br.unesp.rc.recomendacao.entity.Genero;
import br.unesp.rc.recomendacao.entity.Review;
import br.unesp.rc.recomendacao.entity.Usuario;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ObraDTO {

    private int id;
    private String title;
    private List<Genero> genres;
    private String sinopsis;
    private String poster;
    private String directorName;
    private double rating;
    private int year;
    private List<Review> reviews;

    public ObraDTO(int id, String title, List<Genero> genres, String sinopsis, String poster, String directorName, double rating, int year, List<Review> reviews) {
        this.id = id;
        this.title = title;
        this.genres = genres;
        this.sinopsis = sinopsis;
        this.poster = poster;
        this.directorName = directorName;
        this.rating = rating;
        this.year = year;
        this.reviews = reviews;
    }


}
