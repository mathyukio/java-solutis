package elasticcode.solutis.exercicio53;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada: ");
        int num = lt.nextInt();

        for(int i = 1; i <= 10; i++){
            int prd = i * num;
            System.out.printf("%d x %d = %d%n", i, num, prd);
        }
    }
}
