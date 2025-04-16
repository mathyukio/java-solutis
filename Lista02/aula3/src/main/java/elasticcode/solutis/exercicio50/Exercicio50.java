package elasticcode.solutis.exercicio50;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio50 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a posição de fibonacci que voce deseja saber: ");
        Integer n = sc.nextInt();

        acharPosicaoFibonacci(n);
    }

    public static void acharPosicaoFibonacci(int n) {

        long a = 1;
        long b = 1;

        List<Long> fibonacci = new ArrayList<>();

        fibonacci.add(a);
        fibonacci.add(b);

        for (int i = 3; i < n; i++) {
            Long proximo = a + b;
            a = b;
            b = proximo;
            fibonacci.add(proximo);
        }

        System.out.println(fibonacci);
        System.out.println("O n-ezimo que foi escolheu é: " + fibonacci.get(fibonacci.size() - 1));
    }
}
