package elasticcode.solutis.exercicio12;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);

        System.out.println("Nota 1: ");
        int total = lt.nextInt();
        System.out.println("Nota 2: ");
        total += lt.nextInt();
        System.out.println("Nota 3: ");
        total += lt.nextInt();

        double media = (double) total / 3;

        if(media >= 7) System.out.println("Aprovado!");
        else if (media >= 5) System.out.println("Recuperação!");
        else System.out.println("Reprovado!");
    }
}
