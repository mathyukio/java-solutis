package elasticcode.solutis.exercicio64;

import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Insira a quantidade de triângulos: ");
        int qtdTri = lt.nextInt();

        for(int i = 1; i <= qtdTri; i++){
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            System.out.println();
        }
    }
}
