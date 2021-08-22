package br.unesp.rc.recomendacao.resource;

import br.unesp.rc.recomendacao.dto.ReviewDTO;
import br.unesp.rc.recomendacao.dto.assember.ReviewAssember;
import br.unesp.rc.recomendacao.entity.Review;
import br.unesp.rc.recomendacao.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/films")
public class ReviewResource {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/review/publish")
    public boolean saveReview(@RequestBody ReviewDTO reviewDto) {
        boolean insert = false;

        Review review = ReviewAssember.dtoToEntityModel(reviewDto);
        Review reviewInsert = reviewService.save(review);

        if (reviewInsert != null) {
            insert = true;
        }

        return insert;
    }

    /*@GetMapping("/{filmId}/reviews")
    public List<Review> getFilmReviews(@PathVariable(value = "filmId") int filmId) {

    }*/
}
