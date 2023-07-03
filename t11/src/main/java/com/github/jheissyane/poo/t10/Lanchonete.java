package com.github.jheissyane.poo.t11;

import java.util.ArrayList;
import java.util.List;

class Funcionario {
    
}

class Gerente extends Funcionario {
    
}

public class Lanchonete {
    private List<Funcionario> funcionarios;
    private Gerente gerente;

    public Lanchonete() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void definirGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
