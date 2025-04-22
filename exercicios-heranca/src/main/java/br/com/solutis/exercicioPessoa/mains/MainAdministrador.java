package br.com.solutis.exercicioPessoa.mains;

import br.com.solutis.exercicioPessoa.Administrador;

public class MainAdministrador {

    public static void main(String[] args) {

        Administrador adm = new Administrador("Yukio", "Av Paulista",
                "0111", 002, 1000.0,
                10.0, 300.0);

        System.out.println("O salário do administrador é: " + adm.calcularSalario());

    }
}
