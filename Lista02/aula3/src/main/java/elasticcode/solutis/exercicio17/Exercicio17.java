package elasticcode.solutis.exercicio17;

import java.time.LocalDate;

public class Exercicio17 {

    public String signo = "";

    public String descobrirSigno(Integer dia, Integer mes) {
        LocalDate data = LocalDate.of(LocalDate.now().getYear(), mes, dia);

        if ((data.isEqual(LocalDate.of(data.getYear(), 3, 21))
                || data.isAfter(LocalDate.of(data.getYear(), 3, 21))) &&
                (data.isEqual(LocalDate.of(data.getYear(), 4, 19))
                        || data.isBefore(LocalDate.of(data.getYear(), 4, 19)))) {
            return "Áries";
        } else if ((data.isEqual(LocalDate.of(data.getYear(), 4, 20))
                || data.isAfter(LocalDate.of(data.getYear(), 4, 20))) &&
                (data.isEqual(LocalDate.of(data.getYear(), 5, 20))
                        || data.isBefore(LocalDate.of(data.getYear(), 5, 20)))) {
            return "Touro";
        } else if ((data.isEqual(LocalDate.of(data.getYear(), 5, 21))
                || data.isAfter(LocalDate.of(data.getYear(), 5, 21))) &&
                (data.isEqual(LocalDate.of(data.getYear(), 6, 20))
                        || data.isBefore(LocalDate.of(data.getYear(), 6, 20)))) {
            return "Gêmeos";
        } else if ((data.isEqual(LocalDate.of(data.getYear(), 6, 21))
                || data.isAfter(LocalDate.of(data.getYear(), 6, 21))) &&
                (data.isEqual(LocalDate.of(data.getYear(), 7, 22))
                        || data.isBefore(LocalDate.of(data.getYear(), 7, 22)))) {
            return "Câncer";
        } else if ((data.isEqual(LocalDate.of(data.getYear(), 7, 23))
                || data.isAfter(LocalDate.of(data.getYear(), 7, 23))) &&
                (data.isEqual(LocalDate.of(data.getYear(), 8, 22))
                        || data.isBefore(LocalDate.of(data.getYear(), 8, 22)))) {
            return "Leão";
        } else if ((data.isEqual(LocalDate.of(data.getYear(), 8, 23))
                || data.isAfter(LocalDate.of(data.getYear(), 8, 23))) &&
                (data.isEqual(LocalDate.of(data.getYear(), 9, 22))
                        || data.isBefore(LocalDate.of(data.getYear(), 9, 22)))) {
            return "Virgem";
        } else if ((data.isEqual(LocalDate.of(data.getYear(), 9, 23))
                || data.isAfter(LocalDate.of(data.getYear(), 9, 23))) &&
                (data.isEqual(LocalDate.of(data.getYear(), 10, 22))
                        || data.isBefore(LocalDate.of(data.getYear(), 10, 22)))) {
            return "Libra";
        } else if ((data.isEqual(LocalDate.of(data.getYear(), 10, 23))
                || data.isAfter(LocalDate.of(data.getYear(), 10, 23))) &&
                (data.isEqual(LocalDate.of(data.getYear(), 11, 21))
                        || data.isBefore(LocalDate.of(data.getYear(), 11, 21)))) {
            return "Escorpião";
        } else if ((data.isEqual(LocalDate.of(data.getYear(), 11, 22))
                || data.isAfter(LocalDate.of(data.getYear(), 11, 22))) &&
                (data.isEqual(LocalDate.of(data.getYear(), 12, 21))
                        || data.isBefore(LocalDate.of(data.getYear(), 12, 21)))) {
            return "Sagitário";
        } else if ((data.isEqual(LocalDate.of(data.getYear(), 12, 22))
                || data.isAfter(LocalDate.of(data.getYear(), 12, 22))) &&
                (data.isEqual(LocalDate.of(data.getYear(), 12, 31))
                        || data.isBefore(LocalDate.of(data.getYear(), 12, 31)))) {
            return "Capricórnio";
        } else if ((data.isEqual(LocalDate.of(data.getYear(), 1, 1))
                || data.isAfter(LocalDate.of(data.getYear(), 1, 1))) &&
                (data.isEqual(LocalDate.of(data.getYear(), 1, 19))
                        || data.isBefore(LocalDate.of(data.getYear(), 1, 19)))) {
            return "Capricórnio";
        } else if ((data.isEqual(LocalDate.of(data.getYear(), 1, 20))
                || data.isAfter(LocalDate.of(data.getYear(), 1, 20))) &&
                (data.isEqual(LocalDate.of(data.getYear(), 2, 18))
                        || data.isBefore(LocalDate.of(data.getYear(), 2, 18)))) {
            return "Aquário";
        } else if ((data.isEqual(LocalDate.of(data.getYear(), 2, 19))
                || data.isAfter(LocalDate.of(data.getYear(), 2, 19))) &&
                (data.isEqual(LocalDate.of(data.getYear(), 3, 20))
                        || data.isBefore(LocalDate.of(data.getYear(), 3, 20)))) {
            return "Peixes";
        }
        return "Data inválida";
    }

}
