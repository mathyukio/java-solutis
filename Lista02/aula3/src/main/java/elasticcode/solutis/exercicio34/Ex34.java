package elasticcode.solutis.exercicio34;

import java.util.Random;

public class Ex34 {
    public static void main(String[] args) {
        Random random = new Random();

        for(int i = 0; i < 100; i++){
            System.out.println("%d - Número: %d".formatted(i+1, random.nextInt(0, 100)));
        }
    }
}
