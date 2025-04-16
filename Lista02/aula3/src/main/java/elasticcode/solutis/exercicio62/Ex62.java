package elasticcode.solutis.exercicio62;

import java.util.Scanner;

public class Ex62 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Insira a quantidade de linhas desejadas: ");
        int qtdLn = lt.nextInt();

        StringBuilder piramide = new StringBuilder();

        for (int i = 1; i <= qtdLn; i++){

            for (int j = 1; j <= i; j++) {
                piramide.append(i);
            }

            for (int j = 1; j <= qtdLn - i; j++) {
                piramide.append(" ");
            }

            piramide.append("\n");
        }

        System.out.println("Sua pirâmide: ");
        System.out.println("\n\n" + piramide);
    }
}
