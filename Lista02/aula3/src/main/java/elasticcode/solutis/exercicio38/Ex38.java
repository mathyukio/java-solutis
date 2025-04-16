package elasticcode.solutis.exercicio38;

import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Número: ");
        boolean isPrimo = isPrimo(lt.nextInt());

        if(!isPrimo) System.out.println("Número primo");
        else System.out.println("Número não primo");
    }

    public static boolean isPrimo(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0) return true;
        }

        return false;
    }
}
