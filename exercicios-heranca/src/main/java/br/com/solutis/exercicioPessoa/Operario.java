package br.com.solutis.exercicioPessoa;

public class Operario extends Empregado{

    private Double valorProducao;
    private Double comissao;

    public Operario(String nome, String endereco, String telefone, Integer codigoSetor, Double salarioBase, Double imposto, Double valorProducao, Double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario() {
    }

    public Double calcularValorComissao() {
        return valorProducao * (comissao / 100.0);
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + calcularValorComissao();
    }

    public Double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(Double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }
}
