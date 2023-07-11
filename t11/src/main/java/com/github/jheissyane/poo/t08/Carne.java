package com.github.jheissyane.poo.t11;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Produto {
}

public class Compra {
    private Map<Produto, Integer> itens;

    public Compra() {
        itens = new HashMap<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.put(produto, quantidade);
    }
}

public class Prestacao {
    private double valor;
    private Date dataLimite;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }
}

public class Carne {
    private Compra compra;
    private List<Prestacao> prestacoes;

    public Carne() {
        prestacoes = new ArrayList<>();
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void adicionarPrestacao(Prestacao prestacao) {
        prestacoes.add(prestacao);
    }
}
