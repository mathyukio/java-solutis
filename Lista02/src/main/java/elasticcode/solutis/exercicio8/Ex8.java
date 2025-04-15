package elasticcode.solutis.exercicio8;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);

        System.out.println("Insira o numerador: ");
        int num = lt.nextInt();
        System.out.println("Insira o denominador: ");
        int num1 = lt.nextInt();

        if(num1 != 0){
            System.out.println("Número real: %f".formatted((double) num / num1));
        } else{
            System.out.println("Denominador inválido!");
        }
    }
}
