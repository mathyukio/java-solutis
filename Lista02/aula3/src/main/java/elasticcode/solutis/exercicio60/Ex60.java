package elasticcode.solutis.exercicio60;

import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da dívida inicial: R$ ");
        double divida = scanner.nextDouble();

        System.out.print("Informe a taxa de correção mensal (em %): ");
        double taxa = scanner.nextDouble();

        System.out.print("Informe a quantidade de anos: ");
        int anos = scanner.nextInt();

        String[] meses = {
                "Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
                "Jul", "Ago", "Set", "Out", "Nov", "Dez"
        };

        System.out.println("\nTabela de evolução da dívida:");
        int anoAtual = 2007;

        for (int a = 0; a < anos; a++) {
            System.out.println("\n" + (anoAtual + a));
            for (int m = 0; m < 12; m++) {
                System.out.printf("%-4s %.2f\n", meses[m], divida);
                divida *= (1 + taxa / 100);
            }
        }

    }
}
