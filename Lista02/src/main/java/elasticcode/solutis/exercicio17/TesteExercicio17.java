package elasticcode.solutis.exercicio17;

import elasticcode.solutis.exercicio15.Exercicio15;
import elasticcode.solutis.exercicio16.Exercicio16;

import java.util.Scanner;

public class TesteExercicio17 {

    public static void main(String[] args) {
        Exercicio15 ex = new Exercicio15();
        Exercicio16 ex2 = new Exercicio16();
        Exercicio17 ex3 = new Exercicio17();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia do seu aniversário: ");
        int dia = sc.nextInt();
        System.out.println("Digite o mês do seu aniversário: ");
        int mes = sc.nextInt();

        ex.validarMes(mes);
        ex.validarDatadeAniversario(dia, mes);
        ex2.validarSemestre(mes);
        System.out.println("Você é do signo: " + ex3.descobrirSigno(dia, mes));

        sc.close();
    }
}
