package br.unesp.rc.recomendacao.resource;

import br.unesp.rc.recomendacao.dto.UsuarioDTO;
import br.unesp.rc.recomendacao.dto.assember.UsuarioAssember;
import br.unesp.rc.recomendacao.entity.Usuario;
import br.unesp.rc.recomendacao.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public List<Usuario> getAllUsuario() {
        return usuarioService.findAll();
    }

    @PostMapping("/cadastro")
    public boolean saveUsuario(@RequestBody UsuarioDTO usuarioDto) {
        boolean insert = false;

        Usuario usuario = UsuarioAssember.dtoToEntityModel(usuarioDto);
        Usuario usuarioInsert = usuarioService.save(usuario);

        if (usuarioInsert != null) {
            insert = true;
        }

        return insert;
    }
}
