package br.com.solutis.exercicioPessoa;

public class Fornecedor extends Pessoa {

    private Double valorCredito;
    private Double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, Double valorCredito, Double valorDebito) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDebito;
    }

    public Fornecedor(){}

    public Double obterSaldo(){
        return valorCredito - valorDivida;
    }


}
