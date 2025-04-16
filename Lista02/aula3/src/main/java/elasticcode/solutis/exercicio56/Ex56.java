package elasticcode.solutis.exercicio56;

import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);

        System.out.println("Insira o nome do primeiro candidato: ");
        String cand1 = lt.nextLine();
        int cand1Num = 0;
        System.out.println("Insira o nome do segundo candidato: ");
        String cand2 = lt.nextLine();
        int cand2Num = 0;
        System.out.println("Insira o nome do terceiro candidato: ");
        String cand3 = lt.nextLine();
        int cand3Num = 0;
        int emBranco = 0;

        int voto;
        do {
            String tabela = """
                    Vote em um canidato:
                    1 - %s
                    2 - %s
                    3 - %s
                    4 - EM BRANCO
                    0 - Encerrar votação
                    """.formatted(cand1, cand2, cand3);
            System.out.println(tabela);
            voto = lt.nextInt();

            switch (voto){
                case 1 -> cand1Num++;
                case 2 -> cand2Num++;
                case 3 -> cand3Num++;
                case 4 -> emBranco++;
                case 0 -> System.out.println("Encerrando votação...");
                default -> System.out.println("Voto inválido. Tente novamente.");
            }

        } while (voto != 0);

        int total = cand1Num + cand2Num + cand3Num + emBranco;

        double prc1 = (double) cand1Num / total * 100;
        double prc2 = (double) cand2Num / total * 100;
        double prc3 = (double)  cand3Num / total * 100;
        double prcBranco = (double) emBranco / total * 100;

        String tabelaFinal = """
                Votos totais:
                %s: %.2f
                %s: %.2f
                %s: %.2f
                Em branco: %.2f
                """.formatted(cand1, prc1, cand2, prc2, cand3, prc3, prcBranco);

        System.out.println(tabelaFinal);
    }
}
