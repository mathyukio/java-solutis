package elasticcode.solutis.exercicio42;

import java.util.*;

public class Ex42 {
    public static void main(String[] args) {
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

        } while (!chuteNumero.equals(numeroSorteado));

        System.out.println("\nGerar 40 grupos de 3 números entre 0 e 59:");

        for (int i = 1; i <= 40; i++) {
            List<Integer> grupo = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                grupo.add(r.nextInt(60));
            }

            Collections.sort(grupo);

            System.out.println("Grupo " + i + ": " + grupo);
        }
    }
}
