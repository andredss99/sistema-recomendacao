package br.unesp.rc.recomendacao.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString(callSuper = true, includeFieldNames = true)
@EqualsAndHashCode(callSuper = false)
public class Serie extends Obra {

    private ArrayList<String> listaEpisodios;

    public Serie() {}
}
