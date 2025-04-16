package elasticcode.solutis.exercicio54;

import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Insira o valor do dólar atualmente: ");
        System.out.print("$: ");
        double numDolar = lt.nextDouble();


        System.out.println("\nInsira o valor de reais: ");
        System.out.print("R$: ");
        double numReal = lt.nextDouble();

        String tabela = """
        TABELA DE CONVERSÃO (Dólar -> Real):
            %.2f R$
            %.2f $
        """.formatted(numDolar, numDolar * numReal);

        System.out.println(tabela);

    }
}
