package elasticcode.solutis.exercicio5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Digite o valor inicial do débito: ");
        double debito = lt.nextDouble();
        System.out.println("Quantidade de meses: ");
        int meses = lt.nextInt();
        System.out.println("Digite a porcentagem de juros: ");
        double juros = lt.nextDouble() / 100;

        double total = debito * (1 + juros * meses);

        System.out.println("Sua dívida total ficara em: %.2f".formatted(total));
    }
}
