package elasticcode.solutis.exercicio23;

import java.time.LocalDate;

public class Exercicio23 {

    public void verificarQuemFazAniversarioPrimeiro(String nome, String nome2, Integer dia,
                                                    Integer dia2,  Integer mes, Integer mes2) {

        LocalDate aniversario1 = LocalDate.of(LocalDate.now().getYear(), mes, dia);
        LocalDate aniversario2 = LocalDate.of(LocalDate.now().getYear(), mes2, dia2);

        if (aniversario1.isBefore(aniversario2)) {
            System.out.println(nome + " faz aniversário primeiro");
        } else if (aniversario2.isBefore(aniversario1)) {
            System.out.println(nome2 + " faz aniversário primeiro");
        } else {
            System.out.println("Ambos fazem aniversário no mesmo dia!");
        }
    }
}
