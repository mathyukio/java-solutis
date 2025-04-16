package br.com.solutis.metodos.abstratos;

import br.com.solutis.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {

    protected Integer qtdComida;
    protected Integer qtdCaminho;
    protected Integer qtdHoras;

    public AnimalAB(Integer qtdComida, Integer qtdCaminho, Integer qtdHoras) {
        this.qtdComida = qtdComida;
        this.qtdCaminho = qtdCaminho;
        this.qtdHoras = qtdHoras;
    }

    public abstract void comer();
    public abstract void mover();
    public abstract void dormir();

}
