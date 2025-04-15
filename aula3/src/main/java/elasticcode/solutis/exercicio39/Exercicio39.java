package elasticcode.solutis.exercicio39;

import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {
        Exercicio39 ex = new Exercicio39();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        Integer num = sc.nextInt();

        ex.verificarNumeroPerfeito(num);
    }

    public void verificarNumeroPerfeito(Integer num) {
        Integer soma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
        if (soma == num){
            System.out.println("O número é perfeito");
        } else {
            System.out.println("O número nõo é perfeito");
        }
    }
}
