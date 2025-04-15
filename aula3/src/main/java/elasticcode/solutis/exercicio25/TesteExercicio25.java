package elasticcode.solutis.exercicio25;

import java.util.Scanner;

public class TesteExercicio25 {

    public static void main(String[] args) {

        Exercicio25 ex = new Exercicio25();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas: ");
        Integer hora = sc.nextInt();
        System.out.println("Digite os minutos: ");
        Integer minutos = sc.nextInt();
        System.out.println("Digite os segundos: ");
        Integer segundos = sc.nextInt();

        ex.validarHorario(hora, minutos, segundos);
    }
}
