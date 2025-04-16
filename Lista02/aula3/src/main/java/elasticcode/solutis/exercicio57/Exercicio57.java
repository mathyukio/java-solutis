package elasticcode.solutis.exercicio57;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio57 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira data (data/mes/ano): ");
        String data1 = sc.nextLine();

        System.out.println("Digite a segunda data (data/mes/ano): ");
        String data2 = sc.nextLine();

        int dia1 = Integer.parseInt(data1.substring(0, 2));
        int mes1 = Integer.parseInt(data1.substring(3, 5));
        int ano1 = Integer.parseInt(data1.substring(6));

        int dia2 = Integer.parseInt(data2.substring(0, 2));
        int mes2 = Integer.parseInt(data2.substring(3, 5));
        int ano2 = Integer.parseInt(data2.substring(6));

        LocalDate inicio = LocalDate.of(ano1, mes1, dia1);
        LocalDate fim = LocalDate.of(ano2, mes2, dia2);

        while (!inicio.isAfter(fim)) {
            System.out.println(inicio);
            inicio = inicio.plusDays(1);
        }

        sc.close();
    }
}
