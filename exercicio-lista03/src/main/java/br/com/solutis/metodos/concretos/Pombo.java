package br.com.solutis.metodos.concretos;

import br.com.solutis.metodos.abstratos.AnimalVoadorAB;

public class Pombo  extends AnimalVoadorAB {

    public Pombo(Integer qtdComida, Integer qtdCaminho, Integer qtdHoras) {
        super(qtdComida, qtdCaminho, qtdHoras);
    }

    @Override
    public void voar() {
        super.voar();
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
