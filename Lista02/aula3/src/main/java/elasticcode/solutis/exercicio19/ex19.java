package elasticcode.solutis.exercicio19;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);

        System.out.println("Número 1: ");
        int num1 = lt.nextInt();
        System.out.println("Número 2: ");
        int num2 = lt.nextInt();

        if(num1 > num2){
            System.out.println("%d, %d".formatted(num2, num1));
        } else{
            System.out.println("%d, %d".formatted(num1, num2));
        }
    }
}
