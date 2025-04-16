package br.com.solutis.carros;

public class CarroGNV extends Carro {

    private Integer qtdCilindros;
    private String autorizacaoINMETRO;

    public CarroGNV(Integer id, String placa, String marca, String modelo, String cor, Double tanque, Double precoCusto, Integer qtdCilindros, String autorizacaoINMETRO) {
        super(id, placa, marca, modelo, cor, tanque, precoCusto);
        this.qtdCilindros = qtdCilindros;
        this.autorizacaoINMETRO = autorizacaoINMETRO;
    }

    @Override
    public Double getPrecoVenda() {
        return super.getPrecoCusto() * 1.4;
    }
}
