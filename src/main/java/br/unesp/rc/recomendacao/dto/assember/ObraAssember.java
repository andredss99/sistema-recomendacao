package br.unesp.rc.recomendacao.dto.assember;

import br.unesp.rc.recomendacao.dto.GeneroDTO;
import br.unesp.rc.recomendacao.dto.ObraDTO;
import br.unesp.rc.recomendacao.dto.UsuarioDTO;
import br.unesp.rc.recomendacao.entity.Genero;
import br.unesp.rc.recomendacao.entity.Obra;
import br.unesp.rc.recomendacao.entity.Usuario;

public class ObraAssember {

    public ObraAssember() {}

    public static Obra dtoToEntityModel(ObraDTO obraDto) {
        Obra obra = new Obra();

        obra.setId(obraDto.getId());
        obra.setTitle(obraDto.getTitle());
        obra.setGenres(obraDto.getGenres());
        obra.setSinopsis(obraDto.getSinopsis());
        obra.setPoster(obraDto.getPoster());
        obra.setDirectorName(obraDto.getDirectorName());
        obra.setRating(obraDto.getRating());
        obra.setYear(obraDto.getYear());
        obra.setReviews(obraDto.getReviews());

        return obra;
    }
}
