package elasticcode.solutis.exercicio37;

import java.util.Scanner;

public class TesteExercicio37 {

    public static void main(String[] args) {

        Exercicio37 ex = new Exercicio37();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        Long num = sc.nextLong();

        ex.calcularFatorial(num);
    }
}
