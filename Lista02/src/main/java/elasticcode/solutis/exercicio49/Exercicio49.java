package elasticcode.solutis.exercicio49;

public class Exercicio49 {

    public static void main(String[] args) {
        long a = 1;
        long b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 3; i <= 50; i++) {
            Long proximo = a + b;
            System.out.println(proximo);
            a = b;
            b = proximo;
        }
    }
}
