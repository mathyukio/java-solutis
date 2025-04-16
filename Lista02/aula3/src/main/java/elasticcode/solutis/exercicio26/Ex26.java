package elasticcode.solutis.exercicio26;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Horário 1");
        System.out.println("Horas: ");
        int hr1 = lt.nextInt();
        System.out.println("Minutos: ");
        int min1 = lt.nextInt();

        System.out.println("\nHorário 2");
        System.out.println("Horas: ");
        int hr2 = lt.nextInt();
        System.out.println("Minutos: ");
        int min2 = lt.nextInt();

        int horario1Segundos = (hr1 * 60) + (min1 * 60);
        int horario2Segundos = (hr2 * 60) + (min2 * 60);

        int diferenca;

        if(horario1Segundos > horario2Segundos) diferenca = horario1Segundos - horario2Segundos;
        else diferenca = horario2Segundos - horario1Segundos;

        System.out.println("Diferença em segundos entre horários: %d segundos".formatted(diferenca));
    }
}
