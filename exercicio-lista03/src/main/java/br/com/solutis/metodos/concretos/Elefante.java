package br.com.solutis.metodos.concretos;

import br.com.solutis.metodos.abstratos.AnimalAB;
import br.com.solutis.metodos.abstratos.AnimalTerrestreAB;

public class Elefante extends AnimalTerrestreAB{


    public Elefante(Integer qtdComida, Integer qtdCaminho, Integer qtdHoras) {
        super(qtdComida, qtdCaminho, qtdHoras);
    }

    @Override
    public void comer() {
        super.comer();
    }

    @Override
    public void mover() {
        super.mover();
    }

    @Override
    public void dormir() {
        super.dormir();
    }
}
