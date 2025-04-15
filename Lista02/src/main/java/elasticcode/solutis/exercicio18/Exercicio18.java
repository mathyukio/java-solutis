package elasticcode.solutis.exercicio18;

import java.time.LocalDate;

public class Exercicio18 {

    public void idadeAtual(Integer anoNascimento,Integer mes, Integer dia, LocalDate hoje) {

        LocalDate aniversarioEsteAno = LocalDate.of(hoje.getYear(), mes, dia);
        Integer idade = hoje.getYear() - anoNascimento;

        if (hoje.isBefore(aniversarioEsteAno)) {
            idade--;
        }
        System.out.println("Idade atual: " + idade + " anos");
    }


}
