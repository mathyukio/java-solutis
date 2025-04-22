package br.com.solutis.exercicioPessoa.mains;

import br.com.solutis.exercicioPessoa.Empregado;

public class MainEmpregado {

    public static void main(String[] args) {


        Empregado empregado = new Empregado("Matheus", "Av Paulista",
                "1111", 001, 1000.0, 10.0);

        System.out.println("O seu salário é de: " + empregado.calcularSalario());
    }

}
