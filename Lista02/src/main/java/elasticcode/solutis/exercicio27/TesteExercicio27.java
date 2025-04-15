package elasticcode.solutis.exercicio27;

import java.util.Scanner;

public class TesteExercicio27 {
    public static void main(String[] args) {

        Exercicio27 exercicio27 = new Exercicio27();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        Integer n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        Integer n2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        Integer n3 = sc.nextInt();

        System.out.println("O maior número é: " + exercicio27.descobrirMaiorNumero(n1, n2, n3));
    }
}
