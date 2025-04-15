package elasticcode.solutis.exercicio15;

import java.time.LocalDate;

public class Exercicio15 {

    String mesEscrito = "";

    public String validarMes(Integer mes) {
        switch (mes){
            case 1:
                return mesEscrito = "Janeiro";
            case 2:
                return mesEscrito = "Fevereiro";
            case 3:
                return mesEscrito = "Março";
            case 4:
                return mesEscrito = "Abril";
            case 5:
                return mesEscrito = "Maio";
            case 6:
                return mesEscrito = "Junho";
            case 7:
                return mesEscrito = "Julho";
            case 8:
                return mesEscrito = "Agosto";
            case 9:
                return mesEscrito = "Setembro";
            case 10:
                return  mesEscrito = "Outubro";
            case 11:
                return mesEscrito = "Novembro";
            case 12:
                return mesEscrito = "Dezembro";
        }
        return null;
    }

    private boolean isDataValida(Integer dia, Integer mes) {
        try {
            LocalDate.of(LocalDate.now().getYear(), mes, dia);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void validarDatadeAniversario(Integer dia, Integer mes){

       if (isDataValida(dia, mes)) {
           System.out.println("Sua data de aniversário é válida" + " e o mes do seu aniversário é: " + mesEscrito);
       } else {
           System.out.println("Sua data de aniversário é inválida");
       }
    }
}
