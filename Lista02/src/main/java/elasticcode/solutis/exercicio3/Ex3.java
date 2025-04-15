package elasticcode.solutis.exercicio3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);

        System.out.println("Insira a quantidade de mulheres: ");
        int m = lt.nextInt();
        System.out.println("Insira a quantidade de homens: ");
        int h = lt.nextInt();

        double mPorc = (m / (double) (h + m)) * 100;
        double hPorc = (h / (double) (h + m)) * 100;

        System.out.println("Porcentagem de homens: %.2f".formatted(hPorc));
        System.out.println("Porcentagem de mulheres: %.2f".formatted(mPorc));
    }
}
