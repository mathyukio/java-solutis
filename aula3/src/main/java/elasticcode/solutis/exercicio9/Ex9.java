package elasticcode.solutis.exercicio9;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = lt.nextInt();

        if(idade >= 18) System.out.println("Maior de idade");
        else System.out.println("Menor de idade");
    }
}
