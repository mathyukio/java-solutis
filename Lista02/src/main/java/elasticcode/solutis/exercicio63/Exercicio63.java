package elasticcode.solutis.exercicio63;

import java.util.Scanner;

public class Exercicio63 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas:");
        Integer linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {
            String linha = "";
            for (int j = 1; j <= i; j++) {
                linha += j + " ";
            }
            System.out.println(linha);
        }
    }
}
