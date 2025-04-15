package elasticcode.solutis.exercicio35;

import java.util.Scanner;

public class TesteExercicio35 {
    public static void main(String[] args) {
        Exercicio35 ex = new Exercicio35();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que vão ser sorteados: ");
        Integer numeroSorteados = sc.nextInt();
        System.out.println("Digite a número mínimo do sorteio: ");
        Integer numeroMin = sc.nextInt();
        System.out.println("Digite o número máximo do sorteio: ");
        Integer numeroMax = sc.nextInt();

        ex.sortearNumeros(numeroSorteados, numeroMin, numeroMax);
    }
}
