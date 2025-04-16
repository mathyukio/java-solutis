package elasticcode.solutis.exercicio44;

import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        int soma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int qtdNum = sc.nextInt();

        for (int contador = 0; contador < qtdNum; contador++){
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            soma += num;
        }

        double media = soma / 500.0;
        System.out.println("A média dos números é: " + media);
    }
}
