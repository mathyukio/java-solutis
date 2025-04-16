package br.com.solutis.metodos.abstratos;

public class AnimalVoadorAB extends AnimalAB {

    public AnimalVoadorAB(Integer qtdComida, Integer qtdCaminho, Integer qtdHoras) {
        super(qtdComida, qtdCaminho, qtdHoras);
    }

    @Override
    public void comer() {

    }

    @Override
    public void mover() {

    }

    @Override
    public void dormir() {

    }

    public void voar(){}
}
