package br.com.solutis.metodos.concretos;

import br.com.solutis.metodos.abstratos.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {
    public Peixe(Integer qtdComida, Integer qtdCaminho, Integer qtdHoras) {
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

    @Override
    public void nadar() {
        super.nadar();
    }
}
