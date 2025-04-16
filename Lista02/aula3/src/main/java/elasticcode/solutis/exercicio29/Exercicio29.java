package elasticcode.solutis.exercicio29;

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite x1: ");
        Integer x1 = sc.nextInt();
        System.out.print("Digite y1: ");
        Integer y1 = sc.nextInt();

        System.out.print("Digite x2: ");
        Integer x2 = sc.nextInt();
        System.out.print("Digite y2: ");
        Integer y2 = sc.nextInt();

        if (x1 == x2 && y1 == y2) {
            System.out.println("É um ponto.");
        } else if (y1 == y2 && x1 != x2) {
            System.out.println("É uma reta horizontal.");
        } else if (x1 == x2 && y1 != y2) {
            System.out.println("É uma reta vertical.");
        } else {
            System.out.println("É um retângulo.");

            Integer area = Math.abs(x2 - x1) * Math.abs(y1 - y2);
            System.out.println("Área do retângulo: " + area);

            System.out.print("Digite o x do ponto extra: ");
            Integer px = sc.nextInt();
            System.out.print("Digite o y do ponto extra: ");
            Integer py = sc.nextInt();

            Integer esquerda = Math.min(x1, x2);
            Integer direita = Math.max(x1, x2);
            Integer topo = Math.max(y1, y2);
            Integer fundo = Math.min(y1, y2);

            if (px < esquerda && py > topo) {
                System.out.println("Acima e à esquerda.");
            } else if (px >= esquerda && px <= direita && py > topo) {
                System.out.println("Acima.");
            } else if (px > direita && py > topo) {
                System.out.println("Acima e à direita.");
            } else if (px < esquerda && py < fundo) {
                System.out.println("Embaixo e à esquerda.");
            } else if (px >= esquerda && px <= direita && py < fundo) {
                System.out.println("Embaixo.");
            } else if (px > direita && py < fundo) {
                System.out.println("Embaixo e à direita.");
            } else if (px < esquerda && py >= fundo && py <= topo) {
                System.out.println("À esquerda.");
            } else if (px > direita && py >= fundo && py <= topo) {
                System.out.println("À direita.");
            } else if (px > esquerda && px < direita && py > fundo && py < topo) {
                System.out.println("Dentro do retângulo.");
            } else {
                System.out.println("Na linha do retângulo.");
            }
        }
    }
}
