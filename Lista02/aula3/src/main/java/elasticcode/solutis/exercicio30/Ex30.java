package elasticcode.solutis.exercicio30;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] r1 = new int[4][2];
        int[][] r2 = new int[4][2];

        System.out.println("Digite os 4 pontos do retângulo 1:");
        for (int i = 0; i < 4; i++) {
            r1[i][0] = sc.nextInt();
            r1[i][1] = sc.nextInt();
        }

        System.out.println("Digite os 4 pontos do retângulo 2:");
        for (int i = 0; i < 4; i++) {
            r2[i][0] = sc.nextInt();
            r2[i][1] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (r1[i][0] == r2[j][0] && r1[i][1] == r2[j][1]) {
                    System.out.println("Erro: há sobreposição de vértices entre os retângulos.");
                    sc.close();
                    return;
                }
            }
        }

        boolean intersecta = isIntersecta(r1, r2);

        if (intersecta) {
            System.out.println("Os retângulos se interceptam.");
        } else {
            System.out.println("Os retângulos não se interceptam.");
        }
    }

    private static boolean isIntersecta(int[][] r1, int[][] r2) {
        int xMin1 = r1[0][0], xMax1 = r1[0][0];
        int yMin1 = r1[0][1], yMax1 = r1[0][1];
        for (int i = 1; i < 4; i++) {
            xMin1 = Math.min(xMin1, r1[i][0]);
            xMax1 = Math.max(xMax1, r1[i][0]);
            yMin1 = Math.min(yMin1, r1[i][1]);
            yMax1 = Math.max(yMax1, r1[i][1]);
        }

        int xMin2 = r2[0][0], xMax2 = r2[0][0];
        int yMin2 = r2[0][1], yMax2 = r2[0][1];
        for (int i = 1; i < 4; i++) {
            xMin2 = Math.min(xMin2, r2[i][0]);
            xMax2 = Math.max(xMax2, r2[i][0]);
            yMin2 = Math.min(yMin2, r2[i][1]);
            yMax2 = Math.max(yMax2, r2[i][1]);
        }

        boolean intersecta = !(xMax1 < xMin2 || xMin1 > xMax2 || yMax1 < yMin2 || yMin1 > yMax2);
        return intersecta;
    }
}
