package br.unesp.rc.recomendacao.resource;

import br.unesp.rc.recomendacao.dto.GeneroDTO;
import br.unesp.rc.recomendacao.dto.UsuarioDTO;
import br.unesp.rc.recomendacao.dto.assember.GeneroAssember;
import br.unesp.rc.recomendacao.dto.assember.UsuarioAssember;
import br.unesp.rc.recomendacao.entity.Genero;
import br.unesp.rc.recomendacao.entity.Usuario;
import br.unesp.rc.recomendacao.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/genres")
public class GeneroResource {

    @Autowired
    private GeneroService generoService;

    @PostMapping("/cadastro")
    public boolean saveGenero(@RequestBody GeneroDTO generoDTO) {
        boolean insert = false;

        Genero genero = GeneroAssember.dtoToEntityModel(generoDTO);
        Genero generoInsert = generoService.save(genero);

        if (generoInsert != null) {
            insert = true;
        }

        return insert;
    }

    @GetMapping("/")
    public List<Genero> getAllGenres() {
        return generoService.findAll();
    }
}
