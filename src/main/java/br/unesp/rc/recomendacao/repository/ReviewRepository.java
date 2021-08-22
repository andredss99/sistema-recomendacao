package br.unesp.rc.recomendacao.repository;

import br.unesp.rc.recomendacao.entity.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReviewRepository extends MongoRepository<Review, String> {

}
