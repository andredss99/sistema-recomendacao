package br.unesp.rc.recomendacao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Review {

    private int filmId;
    private int userId;
    private String review;
    private int rating;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private String dataPublicacao;

    public Review() {}
}
