package br.com.solutis.exercicioPessoa.mains;

import br.com.solutis.exercicioPessoa.Operario;

public class MainOperario {

    public static void main(String[] args) {

        Operario operario = new Operario("Matheus", "Av Paulista",
                "1111", 001, 1000.0,
                10.0, 1000.0, 10.0);

        System.out.println("O salário do operário é: " + operario.calcularSalario());
    }
}
