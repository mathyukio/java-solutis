package elasticcode.solutis.exercicio23;

import java.util.Scanner;

public class TesteExercicio23 {

    public static void main(String[] args) {

        Exercicio23 ex23 = new Exercicio23();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro aniversariante: ");
        String nome = sc.nextLine();
        System.out.println("Digite o mês de aniversário do primeiro aniversariante: ");
        Integer mes = sc.nextInt();
        System.out.println("Digite o dia do aniversário do primeiro aniversariante: ");
        Integer dia = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o nome do segundo aniversariante: ");
        String nome2 = sc.nextLine();
        System.out.println("Digte o mês de aniversário do segundo aniversariante: ");
        Integer mes2 = sc.nextInt();
        System.out.println("Digite o dia do aniversário do segundo aniversariante: ");
        Integer dia2 = sc.nextInt();

        ex23.verificarQuemFazAniversarioPrimeiro(nome, nome2, dia, dia2, mes, mes2);
        sc.close();

    }
}
