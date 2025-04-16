package elasticcode.solutis.exercicio65;

import java.util.Scanner;

public class Exercicio65 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas:");
        Integer linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {
            String espacos = "";
            String asteriscos = "";

            for (int j = 1; j <= linhas - i; j++) {
                espacos += " ";
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                asteriscos += "*";
            }

            System.out.println(espacos + asteriscos);
        }

        sc.close();
    }
}
