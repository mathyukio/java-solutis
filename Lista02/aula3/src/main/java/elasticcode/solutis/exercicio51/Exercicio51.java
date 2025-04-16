package elasticcode.solutis.exercicio51;

public class Exercicio51 {

    public static void main(String[] args) {

        long a = 1;
        long b = 1;
        long c = 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        for (int i = 4; i <= 50; i++) {
            Long proximo = a + b + c;
            System.out.println(proximo);
            a = b;
            b = c;
            c = proximo;
        }
    }
}
