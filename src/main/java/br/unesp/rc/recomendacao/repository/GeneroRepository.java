package br.unesp.rc.recomendacao.repository;

import br.unesp.rc.recomendacao.entity.Genero;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GeneroRepository extends MongoRepository<Genero, String> {
}
