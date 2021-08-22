package br.unesp.rc.recomendacao.resource;

import br.unesp.rc.recomendacao.dto.UsuarioDTO;
import br.unesp.rc.recomendacao.dto.assember.UsuarioAssember;
import br.unesp.rc.recomendacao.entity.Usuario;
import br.unesp.rc.recomendacao.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/")
    public List<Usuario> getAllUsuario() {
        return usuarioService.findAll();
    }

    @PostMapping("/cadastro")
    public boolean saveUsuario(@RequestBody UsuarioDTO usuarioDto) {
        boolean insert = false;

        Usuario usuario = UsuarioAssember.dtoToEntityModel(usuarioDto);
        Usuario usuarioInsert = usuarioService.save(usuario);

        final String uriNeoIncludeUser = "http://localhost:8282/api/node/usuario/incluir/";
        restTemplate = restTemplate(new RestTemplateBuilder());
        URI result = restTemplate.postForLocation(uriNeoIncludeUser, usuario, Usuario.class);

        if (usuarioInsert != null) {
            insert = true;
        }

        return insert;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
