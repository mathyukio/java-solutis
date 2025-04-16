package br.com.solutis.carros;

public class Carro {

    protected Integer id;
    protected String placa;
    protected String marca;
    protected String modelo;
    protected String cor;
    protected Double tanque;
    protected Double precoCusto;

    public Carro(Integer id, String placa, String marca, String modelo, String cor, Double tanque, Double precoCusto) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tanque = tanque;
        this.precoCusto = precoCusto;
    }

    private static int qtdCarros;

    public Carro(){
        Carro.qtdCarros++;
    }

    public static int getQtdCarros() {
        return qtdCarros;
    }

    public Double getPrecoVenda() {
        return precoCusto * 1.3;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getTanque() {
        return tanque;
    }

    public void setTanque(Double tanque) {
        this.tanque = tanque;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }
}
