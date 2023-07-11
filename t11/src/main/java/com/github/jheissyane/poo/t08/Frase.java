package com.github.jheissyane.poo.t11;

import java.util.ArrayList;
import java.util.List;

public class Palavra {
    private String sequencia;

    public Palavra(String sequencia) {
        this.sequencia = sequencia;
    }

    public String getSequencia() {
        return sequencia;
    }

    public void setSequencia(String sequencia) {
        this.sequencia = sequencia;
    }
}

public class Frase {
    private List<Palavra> palavras;

    public Frase() {
        palavras = new ArrayList<>();
    }

    public void adicionarPalavra(Palavra palavra) {
        palavras.add(palavra);
    }
}
