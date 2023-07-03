package com.github.jheissyane.poo.t11;

import java.util.ArrayList;
import java.util.List;

class Folha {
    private String forma;

    public Folha(String forma) {
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
}

class Arvore {
    private List<Folha> folhas;

    public Arvore() {
        folhas = new ArrayList<>();
    }

    public void adicionarFolha(Folha folha) {
        folhas.add(folha);
    }
}

public class Floresta {
    private List<Arvore> arvores;

    public Floresta() {
        arvores = new ArrayList<>();
    }

    public void adicionarArvore(Arvore arvore) {
        arvores.add(arvore);
    }
}
