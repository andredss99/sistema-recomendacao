package br.unesp.rc.recomendacao.service;

import br.unesp.rc.recomendacao.entity.Genero;
import br.unesp.rc.recomendacao.entity.Usuario;
import br.unesp.rc.recomendacao.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GeneroService {

    @Autowired
    private GeneroRepository repository;

    public Genero save(Genero entity) {
        Genero persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public List<Genero> findAll() {
        List<Genero> generoList = null;

        if (repository != null) {
            generoList = repository.findAll();
        }

        return generoList;
    }
}
