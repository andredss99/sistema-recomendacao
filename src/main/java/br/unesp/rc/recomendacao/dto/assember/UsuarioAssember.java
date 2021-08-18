package br.unesp.rc.recomendacao.dto.assember;

import br.unesp.rc.recomendacao.dto.UsuarioDTO;
import br.unesp.rc.recomendacao.entity.Usuario;

public class UsuarioAssember {

    public UsuarioAssember() {}

    public static Usuario dtoToEntityModel(UsuarioDTO usuarioDto) {
        Usuario usuario = new Usuario();

        usuario.setEmail(usuarioDto.getEmail());
        usuario.setNome(usuarioDto.getNome());
        usuario.setSenha(usuarioDto.getSenha());

        return usuario;
    }
}
