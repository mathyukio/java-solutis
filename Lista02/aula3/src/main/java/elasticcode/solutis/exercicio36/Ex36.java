package elasticcode.solutis.exercicio36;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Número de começo: ");
        int num1 = lt.nextInt();
        System.out.println("Número de fim: ");
        int num2 = lt.nextInt();

        for(int i = num1; i <= num2; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
