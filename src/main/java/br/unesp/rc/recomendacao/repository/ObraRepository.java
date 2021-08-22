package br.unesp.rc.recomendacao.repository;

import br.unesp.rc.recomendacao.entity.Obra;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ObraRepository extends MongoRepository<Obra, String> {

}
