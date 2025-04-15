package elasticcode.solutis.exercicio10;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);

        System.out.println("Insira seu salário: ");
        double salario = lt.nextDouble();

        System.out.println("Insira o valor de empréstimo desejado: ");
        double emprestimo = lt.nextDouble();

        double req = salario * 0.3;

        if(emprestimo <= req ) System.out.println("Emprestimo aprovado");
        else System.out.println("Emprestimo reprovado");

    }
}
