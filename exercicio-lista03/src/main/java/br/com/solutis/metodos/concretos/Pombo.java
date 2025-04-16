package br.com.solutis.metodos.concretos;

import br.com.solutis.metodos.abstratos.AnimalVoadorAB;

// atributos serão nome, tipo animal, idade, habitat, quantidade de patas, quantidadeAssas,
// envergaduraAssa, altura, peso

public class Pombo  extends AnimalVoadorAB {
    private String nome;
    private String tipoAnimal;
    private Integer idade;
    private String habitat;
    private Integer qtdAsas;
    private Double envegaduraAsa;
    private Double altura;
    private Double peso;

    public Pombo(Integer qtdComida, Integer qtdCaminho, Integer qtdHoras, String nome, String tipoAnimal, Integer idade, String habitat, Integer qtdAsas, Double envegaduraAsa, Double altura, Double peso) {
        super(qtdComida, qtdCaminho, qtdHoras);
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.qtdAsas = qtdAsas;
        this.envegaduraAsa = envegaduraAsa;
        this.altura = altura;
        this.peso = peso;
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
