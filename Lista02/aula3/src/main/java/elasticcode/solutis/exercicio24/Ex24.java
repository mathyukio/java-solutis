package elasticcode.solutis.exercicio24;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        int dia = lt.nextInt();
        System.out.println("Digite o mês: ");
        int mes = lt.nextInt();
        System.out.println("Digite o ano: ");
        int ano = lt.nextInt();

        if(validarData(dia, mes, ano)) System.out.println("Data válida!");
        else System.out.println("Data inválida!");
    }

    public static boolean validarData(int dia, int mes, int ano){
        if((mes < 1 || mes > 12) || ano < 1 || dia < 1) return false;

        switch (mes){
            case 2:
                if(isBissexto(ano)){
                    return dia <= 29;
                } else{
                    return dia <= 28;
                }
            case 4: case 6: case 9: case 11:
                return dia <= 30;
            default:
                return dia <= 31;
        }
    }

    public static boolean isBissexto(int ano){
        return (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
    }
}
