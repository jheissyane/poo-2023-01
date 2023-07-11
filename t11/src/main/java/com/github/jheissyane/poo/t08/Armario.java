package com.github.jheissyane.poo.t11;

import java.util.ArrayList;
import java.util.List;

public class Armario {
    private List<Prateleira> prateleiras;

    public Armario() {
        prateleiras = new ArrayList<>();
    }

    public void adicionarPrateleira(Prateleira prateleira) {
        prateleiras.add(prateleira);
    }
}

public class Prateleira {
    private List<Compartimento> compartimentos;

    public Prateleira() {
        compartimentos = new ArrayList<>();
    }

    public void adicionarCompartimento(Compartimento compartimento) {
        compartimentos.add(compartimento);
    }
}

public class Compartimento {
    private List<Livro> livros;
    private List<CD> cds;

    public Compartimento() {
        livros = new ArrayList<>();
        cds = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarCD(CD cd) {
        cds.add(cd);
    }
}

public class Livro {

}

public class CD {

}
