package br.unesp.rc.recomendacao.dto.assember;

import br.unesp.rc.recomendacao.dto.ReviewDTO;
import br.unesp.rc.recomendacao.entity.Review;

public class ReviewAssember {

    public ReviewAssember() {}

    public static Review dtoToEntityModel(ReviewDTO reviewDto) {
        Review review = new Review();

        review.setDataPublicacao(reviewDto.getDataPublicacao());
        review.setFilmId(reviewDto.getFilmId());
        review.setUserId(reviewDto.getUserId());
        review.setRating(reviewDto.getRating());
        review.setReview(reviewDto.getReview());

        return review;
    }
}
