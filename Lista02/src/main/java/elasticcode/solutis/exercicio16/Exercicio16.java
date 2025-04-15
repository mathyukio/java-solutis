package elasticcode.solutis.exercicio16;

public class Exercicio16 {

    public void validarSemestre(Integer mes) {

        if (mes < 4) {
            System.out.println("Você faz aniversário no primeiro trimestre do ano");
        } else if (mes < 7) {
            System.out.println("Você faz aniversário no segundo trimestre do ano");
        } else if (mes < 10) {
            System.out.println("Você faz aniversário no terceiro trimestre do ano");
        } else if (mes <= 12 ) {
            System.out.println("Você faz aniversário no quarto trimestre do ano");
        }
    }
}
