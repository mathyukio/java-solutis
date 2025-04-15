package elasticcode.solutis.exercicio27;

import java.util.ArrayList;
import java.util.List;

public class Exercicio27 {


    public Integer descobrirMaiorNumero(Integer n1, Integer n2, Integer n3) {

        Integer maior = n1;

        List<Integer> lista = new ArrayList<>();
        lista.add(n1);
        lista.add(n2);
        lista.add(n3);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > maior) {
                maior = lista.get(i);
            }
        }
        return maior;
    }
}
