package elasticcode.solutis.exercicio37;

import java.math.BigInteger;

public class Exercicio37 {

    public void calcularFatorial(Long num) {

        BigInteger fatorial  = BigInteger.valueOf(num);

        for (int i = 1; i <= num; i++) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Fatorial do numero: " + num + " = " + fatorial);
    }
}
