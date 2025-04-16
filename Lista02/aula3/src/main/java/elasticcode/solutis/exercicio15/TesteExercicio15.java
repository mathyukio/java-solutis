package elasticcode.solutis.exercicio15;

import java.util.Scanner;

public class TesteExercicio15 {

    public static void main(String[] args) {

        Exercicio15 ex = new Exercicio15();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia do seu aniversário: ");
        int dia = sc.nextInt();
        System.out.println("Digite o mês do seu aniversário: ");
        int mes = sc.nextInt();

        ex.validarMes(mes);
        ex.validarDatadeAniversario(dia, mes);

        sc.close();

    }
}
