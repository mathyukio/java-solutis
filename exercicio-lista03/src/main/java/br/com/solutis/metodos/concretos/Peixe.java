package br.com.solutis.metodos.concretos;

import br.com.solutis.metodos.abstratos.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {
    private String nome;
    private String tipoAnimal;
    private Integer idade;
    private String habitat;
    private Double peso;

    public Peixe(Integer qtdComida, Integer qtdCaminho, Integer qtdHoras, String nome, String tipoAnimal, Integer idade, String habitat, Double peso) {
        super(qtdComida, qtdCaminho, qtdHoras);
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.peso = peso;
    }

    @Override
    public void comer() {
        super.qtdComida += 4;
    }

    @Override
    public void mover() {
        super.qtdCaminho += 5;
    }

    @Override
    public void dormir() {
        super.qtdHoras += 3;
    }

    @Override
    public void nadar() {
        super.qtdCaminho += 4;
    }
}
