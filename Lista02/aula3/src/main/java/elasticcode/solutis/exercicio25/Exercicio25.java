package elasticcode.solutis.exercicio25;

import java.time.LocalTime;

public class Exercicio25 {

    public void validarHorario(Integer hora, Integer minutos, Integer segundos) {

        try{
            LocalTime horarioValido = LocalTime.of(hora, minutos, segundos);
            System.out.println("O horário digitado é: " + horarioValido);
        }catch(Exception e){
            System.out.println("Erro ao validar horario");
        }

    }
}
