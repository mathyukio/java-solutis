package elasticcode.solutis.exercicio4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Nota 1: ");
        int total = lt.nextInt();
        System.out.println("Nota 2: ");
        total += lt.nextInt();
        System.out.println("Nota 3: ");
        total += lt.nextInt();
        System.out.println("Nota 4: ");
        total += lt.nextInt();

        System.out.println("Sua média: %.2f".formatted((double) total / 4));
    }
}
