package elasticcode.solutis.exercicio41;

import java.util.Random;
import java.util.Scanner;

public class Exercicio41 {

    public void jogar() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        Integer numeroSorteado = r.nextInt(100) + 1; // de 1 a 100
        Integer chuteNumero;
        Integer tentativas = 0;

        System.out.println("Tente adivinhar o número de 1 a 100!");

        do {
            System.out.print("Tente adivinhar o número sorteado: ");
            chuteNumero = sc.nextInt();
            tentativas++;

            if (chuteNumero > numeroSorteado) {
                System.out.println("O número sorteado é menor!");
            } else if (chuteNumero < numeroSorteado) {
                System.out.println("O número sorteado é maior!");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroSorteado + " em "
                        + tentativas + " tentativas!");
            }

        } while (chuteNumero != numeroSorteado);
    }

    public static void main(String[] args) {
        Exercicio41 jogo = new Exercicio41();
        jogo.jogar();
    }
}
