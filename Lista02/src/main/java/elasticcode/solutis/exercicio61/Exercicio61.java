package elasticcode.solutis.exercicio61;

import java.util.Scanner;

public class Exercicio61 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas:");

        Integer linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {
            String linha = "";
            for (int j = 1; j <= i; j++) {
                linha += "*";
            }
            System.out.println(linha);
        }

        sc.close();
    }
}
