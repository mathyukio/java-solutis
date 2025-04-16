package elasticcode.solutis.exercicio28;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Número 1: ");
        int num1 = lt.nextInt();
        System.out.println("Número 2: ");
        int num2 = lt.nextInt();
        System.out.println("Número 3: ");
        int num3 = lt.nextInt();

        if (num1 > num2) { // Estrutura 1
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) { // Estrutura 2
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) { // Estrutura 3
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Os números em ordem crescente são: " + num1 + ", " + num2 + ", " + num3);
    }
}
