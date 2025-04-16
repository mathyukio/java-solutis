package elasticcode.solutis.exercicio46;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex46 {
    public static void main(String[] args) {
        Random rd = new Random();

        List<Pessoa> pessoas = new ArrayList<>();

        int qtdHMaior = 0;
        int qtdFMaior = 0;

        for(int i = 1; i <= 200; i++){
            Pessoa pessoa = new Pessoa(rd.nextInt(10, 81), rd.nextBoolean());
            pessoas.add(pessoa);
        }

        for (Pessoa psDaVez : pessoas) {
            if(psDaVez.getIdade() >= 18){
                if(psDaVez.getSexo() == 'h') qtdHMaior++;
                else qtdFMaior++;
            }
        }

        System.out.println("Quantidade de homens de maior: " + qtdHMaior);
        System.out.println("Quantidade de mulheres de maior: " + qtdFMaior);
    }

    public static class Pessoa{
        public int idade;
        public char sexo;

        public Pessoa(int idade, boolean sexo){
            this.idade = idade;
            if(sexo) this.sexo = 'h';
            else this.sexo = 'f';
        }

        public char getSexo() {
            return sexo;
        }

        public void setSexo(char sexo) {
            this.sexo = sexo;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }
}
