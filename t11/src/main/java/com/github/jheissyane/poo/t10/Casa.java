package com.github.jheissyane.main.t10;

class Cliente {
    private String pessoa;
    private Demanda requisito;
    private Bicicleta bicicleta;

    public void cadastrarCliente() {
        cadastrarCliente("Felipe", "Bicicleta com pneu furado", "Specialized", "Vermelha", 500);
    }

    public void cadastrarCliente(String pessoa, String descricao, String marca, String cor, float preco) {
        this.pessoa = pessoa;
        this.requisito = new Demanda();
        this.requisito.definirDescricao(descricao);
        this.bicicleta = new Bicicleta();
        this.bicicleta.definirDescricao(marca, cor, preco);
    }
}

class Bicicleta {
    private String marca;
    private String cor;
    private float preco;

    public void definirDescricao(String marca, String cor, float preco) {
        this.marca = marca;
        this.cor = cor;
        this.preco = preco;
    }
}

class Demanda {
    private String descricao;

    public void definirDescricao(String descricao) {
        this.descricao = descricao;
    }
}
