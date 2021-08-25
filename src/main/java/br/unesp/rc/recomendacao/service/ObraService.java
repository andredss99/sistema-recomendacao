package br.unesp.rc.recomendacao.service;

import br.unesp.rc.recomendacao.entity.Obra;
import br.unesp.rc.recomendacao.repository.ObraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ObraService {

    @Autowired
    private ObraRepository repository;

    public Obra save(Obra entity) {
        Obra persistedEntity = null;

        if (repository != null) {
            repository.save(entity);
        }

        return persistedEntity;
    }

    public List<Obra> findAll() {
        List<Obra> listaObras = null;

        if (repository != null) {
            listaObras = repository.findAll();
        }

        return listaObras;
    }

    public Optional<Obra> findById(String id) {
        Optional<Obra> listaObras = null;

        if (repository != null) {
            listaObras = repository.findById(id);
        }

        return listaObras;
    }
}
