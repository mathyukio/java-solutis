package br.com.solutis.carros;

public class ContadorDeCarros {

    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();
        Carro carro4 = new Carro();

        System.out.println("Quantidade de carros criados: " + Carro.getQtdCarros());


    }
}
