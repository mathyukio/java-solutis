package br.com.solutis.metodos.abstratos;

import br.com.solutis.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {

    public Integer qtdComida;
    public Integer qtdCaminho;
    public Integer qtdHoras;

    abstract public void comer();
    abstract public void mover();
    abstract public void dormir();

}
