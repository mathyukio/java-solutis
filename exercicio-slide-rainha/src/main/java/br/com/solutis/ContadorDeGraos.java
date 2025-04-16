package br.com.solutis;

import java.math.BigInteger;

public class ContadorDeGraos {

    public static void main(String[] args) {

        BigInteger [][] xadrez = new BigInteger[8][8];

        BigInteger total = BigInteger.ZERO;
        BigInteger graos = BigInteger.ONE;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                xadrez[i][j] = graos;
                total = total.add(graos);
                graos = graos.multiply(BigInteger.TWO);
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(xadrez[i][j] + " ");
            }
        }

        /*
            Se fosse utilizado o int, o overflow aconteceria na casa 32
            Se fosse utilizado o long, o overflow aconteceriad na casa 64
         */
    }
}
