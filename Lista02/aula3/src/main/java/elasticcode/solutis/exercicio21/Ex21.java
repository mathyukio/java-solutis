package elasticcode.solutis.exercicio21;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        String menuCg = """
                Selecione uma opção de cargo:
                1 - Diretoria
                2 - Gerência
                3 - Operacional
                """;

        Scanner lt = new Scanner(System.in);
        System.out.println("Insira o valor do seu salário");
        double salario = lt.nextDouble();

        System.out.println(menuCg);
        int numCg = lt.nextInt();

        double emprestimo = 0.0;

        switch (numCg){
            case 1 -> emprestimo = salario * 0.3;
            case 2 -> emprestimo = salario * 0.25;
            case 3 -> emprestimo = salario * 0.2;
            default -> System.out.println("Opção inválida!");
        }

        System.out.println("Empréstimo disponível: %.2f".formatted(emprestimo));
    }
}
