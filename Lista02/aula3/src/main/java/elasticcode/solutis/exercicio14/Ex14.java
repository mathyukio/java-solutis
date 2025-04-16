package elasticcode.solutis.exercicio14;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Escreva um mês: ");
        String mes = lt.nextLine();

        if(mes.equalsIgnoreCase("janeiro")) System.out.println("Mês: 1");
        else if (mes.equalsIgnoreCase("fevereiro")) System.out.println("Mês: 2");
        else if (mes.equalsIgnoreCase("março")) System.out.println("Mês: 3");
        else if (mes.equalsIgnoreCase("abril")) System.out.println("Mês: 4");
        else if (mes.equalsIgnoreCase("maio")) System.out.println("Mês: 5");
        else if (mes.equalsIgnoreCase("junho")) System.out.println("Mês: 6");
        else if (mes.equalsIgnoreCase("julho")) System.out.println("Mês: 7");
        else if (mes.equalsIgnoreCase("agosto")) System.out.println("Mês: 8");
        else if (mes.equalsIgnoreCase("setembro")) System.out.println("Mês: 9");
        else if (mes.equalsIgnoreCase("outubro"))  System.out.println("Mês: 10");
        else if (mes.equalsIgnoreCase("novembro")) System.out.println("Mês: 11");
        else if (mes.equalsIgnoreCase("dezembro")) System.out.println("Mês: 12");
        else System.out.println("Mês inválido");
    }
}
