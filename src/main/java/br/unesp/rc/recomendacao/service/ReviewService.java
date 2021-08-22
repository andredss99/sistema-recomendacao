package br.unesp.rc.recomendacao.service;

import br.unesp.rc.recomendacao.entity.Review;
import br.unesp.rc.recomendacao.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReviewService {

    @Autowired
    private ReviewRepository repository;

    private MongoTemplate mongoTemplate;

    public ReviewService() {}

    public Review save(Review entity) {
        Review persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }
}
