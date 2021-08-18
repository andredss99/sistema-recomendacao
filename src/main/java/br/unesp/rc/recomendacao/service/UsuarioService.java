package br.unesp.rc.recomendacao.service;

import br.unesp.rc.recomendacao.entity.Usuario;
import br.unesp.rc.recomendacao.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public UsuarioService() {}

    public Usuario save(Usuario entity) {
        Usuario persistedEntity = null;

        if (repository != null) {
            persistedEntity = repository.save(entity);
        }

        return persistedEntity;
    }

    public List<Usuario> findAll() {
        List<Usuario> listaUsuarios = null;

        if (repository != null) {
            listaUsuarios = repository.findAll();
        }

        return listaUsuarios;
    }
}
