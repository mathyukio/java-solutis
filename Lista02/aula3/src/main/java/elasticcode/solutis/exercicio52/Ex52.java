package elasticcode.solutis.exercicio52;

import java.math.BigInteger;

public class Ex52 {
    public static void main(String[] args) {
        BigInteger totalGraos = BigInteger.ZERO;
        BigInteger graosNaCasa = BigInteger.ONE;

        for (int i = 1; i <= 64; i++) {
            totalGraos = totalGraos.add(graosNaCasa);
            graosNaCasa = graosNaCasa.multiply(BigInteger.TWO);
        }

        System.out.println("Total de grãos de arroz: " + totalGraos);

        BigInteger graosPorSaco = BigInteger.valueOf(50000);
        BigInteger totalSacos = totalGraos.divide(graosPorSaco);

        System.out.println("Equivalente em sacos de arroz: " + totalSacos);
    }
}
