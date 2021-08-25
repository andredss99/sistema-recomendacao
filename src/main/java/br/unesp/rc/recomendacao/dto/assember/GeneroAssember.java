package br.unesp.rc.recomendacao.dto.assember;

import br.unesp.rc.recomendacao.dto.GeneroDTO;
import br.unesp.rc.recomendacao.dto.UsuarioDTO;
import br.unesp.rc.recomendacao.entity.Genero;
import br.unesp.rc.recomendacao.entity.Usuario;

public class GeneroAssember {

    public GeneroAssember() {}

    public static Genero dtoToEntityModel(GeneroDTO generoDTO) {
        Genero genero = new Genero();

        genero.setId(generoDTO.getId());
        genero.setName(generoDTO.getName());

        return genero;
    }
}
