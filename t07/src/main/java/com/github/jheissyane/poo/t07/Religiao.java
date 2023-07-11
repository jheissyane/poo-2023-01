package com.github.jheissyane.poo.t07;

import java.util.ArrayList;
import java.util.List;

public class Religiao {
    private List<Devoto> devotos;

    public Religiao() {
        devotos = new ArrayList<>();
    }

    public void novoDevoto(Devoto devoto) {
        devotos.add(devoto);
    }
}
