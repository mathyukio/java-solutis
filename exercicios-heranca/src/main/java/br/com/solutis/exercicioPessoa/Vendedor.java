package br.com.solutis.exercicioPessoa;

public class Vendedor extends Empregado{

    private Double valorVendas;
    private Double comissao;

    public Vendedor(String nome, String endereco, String telefone, Integer codigoSetor, Double salarioBase, Double imposto, Double valorVendas, Double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor() {
    }

    public Double calcularValorVendas() {
        return valorVendas * (comissao / 100.0);
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + calcularValorVendas();
    }

    public Double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(Double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }
}
