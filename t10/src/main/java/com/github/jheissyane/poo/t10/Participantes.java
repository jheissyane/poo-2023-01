package com.github.jheissyane.poo.t10;

import java.util.ArrayList;
import java.util.List;

public class Percurso {
    private List<Pessoa> participantes;

    public Percurso() {
        participantes = new ArrayList<>();
    }

    public void adicionarParticipante(Pessoa participante) {
        participantes.add(participante);
    }
}
