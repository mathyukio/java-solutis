package elasticcode.solutis.exercicio11;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = lt.nextInt();

        if(idade >= 16 && idade <= 65) System.out.println("Voto válido");
        else System.out.println("Voto inválido");
    }

}
