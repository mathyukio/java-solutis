package br.com.solutis.exercicioPessoa.mains;

import br.com.solutis.exercicioPessoa.Vendedor;

public class MainVendedor {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Matheus", "Av Paulista",
                "1111", 001,
                1000.0, 10.0, 1000.0, 10.0);

        System.out.println("O salário do vendedor é: " + vendedor.calcularSalario());
    }
}
