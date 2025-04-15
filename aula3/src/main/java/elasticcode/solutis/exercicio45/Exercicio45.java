package elasticcode.solutis.exercicio45;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        Integer maior = 0;
        Integer contador = 0;

       while (contador < 100){
           System.out.println("Digite um número: ");
           Integer numero = sc.nextInt();
           if (numero > maior){
               maior = numero;
           }
           numeros.add(numero);
           contador++;
       }
       sc.close();
       System.out.println("O maior número da lista é: " + maior);
    }
}
