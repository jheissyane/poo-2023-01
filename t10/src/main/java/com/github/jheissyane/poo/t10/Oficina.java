package com.github.jheissyane.poo.t10;

import java.util.ArrayList;
import java.util.List;

public class OficinaBicicletas {
    private List<Bicicleta> bicicletas;
    private List<Percurso> percursos;

    public OficinaBicicletas() {
        bicicletas = new ArrayList<>();
        percursos = new ArrayList<>();
    }

    public void adicionarBicicleta(Bicicleta bicicleta) {
        bicicletas.add(bicicleta);
    }

    public void organizarPercurso(Percurso percurso) {
        percursos.add(percurso);
    }
}
