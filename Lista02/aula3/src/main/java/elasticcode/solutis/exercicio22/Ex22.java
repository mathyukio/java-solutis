package elasticcode.solutis.exercicio22;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Dia aniversario 1: ");
        int nv1Dia = lt.nextInt();
        System.out.println("Mês aniversario 1: ");
        int nv1Mes = lt.nextInt();

        System.out.println("Dia aniversario 2: ");
        int nv2Dia = lt.nextInt();
        System.out.println("Mês aniversario 2: ");
        int nv2Mes = lt.nextInt();

        if(nv1Dia == nv2Dia && nv1Mes == nv2Mes) System.out.println("Aniversário na mesma data!");
        else System.out.println("Aniversário em datas diferentes!");
    }
}
