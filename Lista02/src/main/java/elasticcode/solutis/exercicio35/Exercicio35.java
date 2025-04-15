package elasticcode.solutis.exercicio35;

import java.util.Random;

public class Exercicio35 {

    public void sortearNumeros(Integer numSorteados, Integer numMin, Integer numMax) {

        Random random = new Random();

        System.out.println("Números sorteados:");
        for (int i = 0; i < numSorteados; i++) {
            int numero = random.nextInt(numMax - numMin + 1) + numMin;
            System.out.print(numero + " ");
        }
    }
}
