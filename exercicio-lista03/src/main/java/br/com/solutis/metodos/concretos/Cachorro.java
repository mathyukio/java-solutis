package br.com.solutis.metodos.concretos;

import br.com.solutis.metodos.abstratos.AnimalAB;
import br.com.solutis.metodos.abstratos.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {
    private String nome;
    private String tipoAnimal;
    private Integer idade;
    private String habitat;
    private Integer qtdPatas;
    private Double altura;
    private Double peso;

    public Cachorro(Integer qtdComida, Integer qtdCaminho, Integer qtdHoras, String nome, String tipoAnimal, Integer idade, String habitat, Integer qtdPatas, Double altura, Double peso) {
        super(qtdComida, qtdCaminho, qtdHoras);
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.qtdPatas = qtdPatas;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public void comer() {
        super.qtdComida += 2;
    }

    @Override
    public void mover() {
        super.qtdCaminho += 9;
    }

    @Override
    public void dormir() {
        super.qtdHoras += 12;
    }
}
