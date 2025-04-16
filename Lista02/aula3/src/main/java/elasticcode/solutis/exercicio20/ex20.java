package elasticcode.solutis.exercicio20;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);

        System.out.println("Pessoa 1");
        System.out.println("Seu nome: ");
        String nm1 = lt.nextLine();
        System.out.println("Sua idade: ");
        int num1 = lt.nextInt();
        lt.nextLine();

        System.out.println("\n\nPessoa 2");
        System.out.println("Seu nome: ");
        String nm2 = lt.nextLine();
        System.out.println("Sua idade: ");
        int num2 = lt.nextInt();

        if(num1 > num2){
            System.out.println("%s, idade: %d\n %s, idade %d".formatted(nm1, num1, nm2, num2));
        } else{
            System.out.println("%s, idade: %d\n %s, idade %d".formatted(nm2, num2, nm1, num1));
        }
    }
}
