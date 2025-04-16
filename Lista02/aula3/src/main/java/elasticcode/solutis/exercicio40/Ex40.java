package elasticcode.solutis.exercicio40;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner lt = new Scanner(System.in);
        System.out.println("Quantidade de pessoas: ");
        int num = lt.nextInt();
        int maiorIdade = 0;
        int menorIdade = 0;
        int mediaIdade = 0;
        int qtdMaiorDeIdade = 0;

        for(int i = 1; i <= num; i++){
            System.out.println("Digite a idade do membro %d".formatted(i));
            int idade = lt.nextInt();

            if(i==1) menorIdade = idade;
            if(idade < menorIdade) menorIdade = idade;
            if(idade > maiorIdade) maiorIdade = idade;
            if(idade >= 18) qtdMaiorDeIdade++;
            mediaIdade += idade;
        }

        System.out.println("""
                Menor idade: %d
                Maior idade: %d
                Quantidade de pessoas de maior: %d
                Média de idade: %d
                """.formatted(menorIdade, maiorIdade, qtdMaiorDeIdade, mediaIdade / num));
    }
}
