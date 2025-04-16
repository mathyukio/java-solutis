package elasticcode.solutis.exercicio58;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Insira uma data (formato dd/MM/yyyy): ");
        String entrada = lt.nextLine();

        LocalDate dataReceb = LocalDate.parse(entrada, formatoBR);

        System.out.print("Insira a quantidade de dias adicionados: ");
        LocalDate dataSomada = dataReceb.plusDays(lt.nextInt());

        System.out.println("Data inserida: " + dataReceb.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\nData somada: " + dataSomada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
