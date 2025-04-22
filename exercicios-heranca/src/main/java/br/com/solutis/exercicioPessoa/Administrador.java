package br.com.solutis.exercicioPessoa;

public class Administrador extends Empregado {

    private Double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, Integer codigoSetor, Double salarioBase, Double imposto, Double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador() {}

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    public Double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(Double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
