package elasticcode.solutis.exercicio7;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Insira a despesa total:");
        double total = lt.nextDouble();

        System.out.println("Comissão garçom: %.2f".formatted(total * 0.1));
    }
}
