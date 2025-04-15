package elasticcode.solutis.exercicio1;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        int dataAtual = LocalDate.now().getYear();
        System.out.println("Insira seu ano de nascimento");
        int nascimento = lt.nextInt();

        System.out.println("Você tem: " + (dataAtual - nascimento) + " anos");
    }
}
