package br.unesp.rc.recomendacao.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDTO {

    private int filmId;
    private int userId;
    private String review;
    private int rating;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private String dataPublicacao;

    public ReviewDTO(int filmId, int userId, String review, int rating, String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
        this.filmId = filmId;
        this.userId = userId;
        this.rating = rating;
        this.review = review;
    }
}
