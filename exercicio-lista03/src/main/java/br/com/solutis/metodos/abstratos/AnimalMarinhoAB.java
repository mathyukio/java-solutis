package br.com.solutis.metodos.abstratos;

public class AnimalMarinhoAB extends AnimalAB {

    public AnimalMarinhoAB(Integer qtdComida, Integer qtdCaminho, Integer qtdHoras) {
        super(qtdComida, qtdCaminho, qtdHoras);
    }

    public void nadar(){}

    @Override
    public void comer() {
    }

    @Override
    public void mover() {

    }

    @Override
    public void dormir() {

    }
}
