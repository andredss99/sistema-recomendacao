package br.unesp.rc.recomendacao.dto;

import br.unesp.rc.recomendacao.entity.Usuario;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class GeneroDTO {

    private int id;
    private String name;

    public GeneroDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
