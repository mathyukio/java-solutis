package elasticcode.solutis.exercicio55;

import java.util.Scanner;

public class Exercicio55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldoTotal = 50.0;
        int minutosPadrao = 100;
        int minutosVaiVai = 50;

        double valorExcedente = 0.0;

        while (true) {
            System.out.println("Digite o tipo da ligação: ");
            String tipo = sc.next().toLowerCase();

            System.out.println("Digite a quantidade de minutos: ");
            int minutos = sc.nextInt();

            int consumoReal;

            switch (tipo) {
                case "o":
                    consumoReal = minutos;
                    break;
                case "v":
                    if (minutosVaiVai > 0) {
                        if (minutos <= minutosVaiVai) {
                            minutosVaiVai -= minutos;
                            consumoReal = 0;
                        } else {
                            consumoReal = minutos - minutosVaiVai;
                            minutosVaiVai = 0;
                        }
                    } else {
                        consumoReal = minutos;
                    }
                    break;
                case "f":
                    consumoReal = minutos / 2;
                    break;
                default:
                    System.out.println("Digite um tipo de ligação válido.");
                    continue;
            }

            if (minutosPadrao >= consumoReal) {
                minutosPadrao -= consumoReal;
            } else {
                int excedente = consumoReal - minutosPadrao;
                minutosPadrao = 0;

                if (tipo.equals("o")) {
                    valorExcedente += excedente * 0.65;
                } else if (tipo.equals("v")) {
                    valorExcedente += excedente * 0.20;
                } else if (tipo.equals("f")) {
                    valorExcedente += excedente * 0.65;
                }
            }

            System.out.println("Minutos restantes do plano: " + minutosPadrao + "minutos.");
            System.out.println("Minutos extras para Vai-Vai: " + minutosVaiVai + "minutos.");
            System.out.println("Valor excedente a pagar até agora: R$ " + valorExcedente);

            System.out.println("Deseja informar outra ligação? (s/n)");
            String continuar = sc.next().toLowerCase();
            if (!continuar.equals("s")) {
                break;
            }
        }

        System.out.println("Resumo final:");
        System.out.println("Minutos restantes do plano: " + minutosPadrao + "minutos.");
        System.out.println("Minutos extras para Vai-Vai: " + minutosVaiVai + "minutos.");
        System.out.println("Valor total a pagar: R$ " + (saldoTotal + valorExcedente));

        sc.close();

    }
}
