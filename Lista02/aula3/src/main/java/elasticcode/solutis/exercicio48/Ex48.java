package elasticcode.solutis.exercicio48;

import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);

        System.out.print("Insira a quantidade de aulas dadas: ");
        int totalAulas = lt.nextInt();
        System.out.print("Insira a quantidade de faltas:");
        int faltas = lt.nextInt();

        double faltasFreq = (double) faltas / totalAulas * 100;


        System.out.print("Insira a quantidade de notas: ");
        int qtdNota = lt.nextInt();

        double totalNotas = 0.0;

        System.out.println("\n");
        for (int i = 0; i < qtdNota; i++){
            System.out.print("Nota %d: ".formatted(i + 1));
            totalNotas += lt.nextDouble();
        }

        double media = totalNotas / qtdNota;

        if(faltasFreq >= 25){
            System.out.println("Reprovado por faltas!");
        } else if (media >= 6) {
            System.out.println("Aprovado com sucesso!");
        } else if (media > 3.9) {
            System.out.print("Insira sua nota de prova final: ");
            double provaFinal = lt.nextDouble();

            if((media + provaFinal) / 2 >= 6){
                System.out.println("Aprovado na recuperação!");
            } else{
                System.out.println("Reprovado");
            }
        } else{
            System.out.println("Reprovado!");
        }
    }
}
