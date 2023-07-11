package com.github.jheissyane.poo.t11;

import java.util.ArrayList;
import java.util.List;

public class Comodo {

}

public class Banheiro extends Comodo {

}

public class Quarto extends Comodo {

}

public class Sala extends Comodo {

}

public class Garagem extends Comodo {

}

public class Area {

}

public class Casa {
    private List<Quarto> quartos;
    private List<Banheiro> banheiros;
    private List<Sala> salas;
    private List<Area> areas;
    private List<Garagem> garagens;

    public Casa() {
        quartos = new ArrayList<>();
        banheiros = new ArrayList<>();
        salas = new ArrayList<>();
        areas = new ArrayList<>();
        garagens = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public void adicionarBanheiro(Banheiro banheiro) {
        banheiros.add(banheiro);
    }

    public void adicionarSala(Sala sala) {
        salas.add(sala);
    }

    public void adicionarArea(Area area) {
        areas.add(area);
    }

    public void adicionarGaragem(Garagem garagem) {
        garagens.add(garagem);
    }
}
