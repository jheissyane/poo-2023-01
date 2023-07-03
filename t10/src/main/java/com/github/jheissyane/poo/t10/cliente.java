package com.github.jheissyane.main.t10;

class Cliente {
    private String nome;
    private Pedido pedido;
    private Bicicleta bicicleta;

    public void cadastrarCliente() {
        Cliente cliente = new Cliente();
        this.cadastrarCliente("João", "Bicicleta com problema no freio", "Caloi", "Azul", 500);
    }

    public void cadastrarCliente(String nome, String descricao, String modelo, String cor, float preco) {
        this.nome = nome;
        this.pedido = new Pedido();
        this.pedido.definirDescricao(descricao);
        this.bicicleta = new Bicicleta();
        this.bicicleta.definirDescricao(modelo, cor, preco);
    }
}

class Bicicleta {
    private String modelo;
    private String cor;
    private float preco;

    public void definirDescricao(String modelo, String cor, float preco) {
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }
}

class Pedido {
    private String descricao;

    public void definirDescricao(String descricao) {
        this.descricao = descricao;
    }
}
