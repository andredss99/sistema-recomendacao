package br.unesp.rc.recomendacao.resource;

import br.unesp.rc.recomendacao.dto.ObraDTO;
import br.unesp.rc.recomendacao.dto.assember.GeneroAssember;
import br.unesp.rc.recomendacao.dto.assember.ObraAssember;
import br.unesp.rc.recomendacao.entity.Genero;
import br.unesp.rc.recomendacao.entity.Obra;
import br.unesp.rc.recomendacao.service.ObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/films")
public class ObraResource {

    @Autowired
    private ObraService obraService;

    @PostMapping("/cadastro")
    public boolean saveFilm(@RequestBody ObraDTO obraDto) {
        boolean insert = false;

        Obra obra = ObraAssember.dtoToEntityModel(obraDto);
        Obra obraInsert = obraService.save(obra);

        if (obraInsert != null) {
            insert = true;
        }

        return insert;
    }

    @GetMapping("/")
    public List<Obra> getAllFilms() {
        return obraService.findAll();
    }
}
