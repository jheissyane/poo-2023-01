package com.github.jheissyane.poo.t10;

public class Bicicleta {
    private String modelo;
    private Pessoa proprietario;

    public Bicicleta(String modelo, Pessoa proprietario) {
        this.modelo = modelo;
        this.proprietario = proprietario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
}
