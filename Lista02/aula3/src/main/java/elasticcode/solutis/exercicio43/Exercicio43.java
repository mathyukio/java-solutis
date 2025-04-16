package elasticcode.solutis.exercicio43;

import java.util.Scanner;

public class Exercicio43 {

    public static void main(String[] args) {

        Integer contador = 0;
        Integer soma = 0;

        Scanner sc = new Scanner(System.in);
        while (contador < 500){
            System.out.println("Digite um número: ");
            Integer num = sc.nextInt();
            soma += num;
            contador++;
        }

        Double media = soma / 500.0;
        System.out.println("A média dos números é: " + media);
    }
}
