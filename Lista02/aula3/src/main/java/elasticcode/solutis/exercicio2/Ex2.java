package elasticcode.solutis.exercicio2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Informe seu salário: ");
        double salario = lt.nextDouble();
        System.out.println("Informe o valor atual do salário minimo: ");
        double salarioMin = lt.nextDouble();

        System.out.println("Você recebe a quantidade: %.2f salários mínimos".formatted(salario/salarioMin));
    }
}
