package br.unesp.rc.recomendacao.repository;

import br.unesp.rc.recomendacao.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
