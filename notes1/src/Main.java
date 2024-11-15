import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeticions = sc.nextInt();
        int[][] total = new int[repeticions][];

        for (int i = 0; i < repeticions; i++) {
            int files = sc.nextInt();
            total[i] = new int[files];
            int columnes = sc.nextInt();
            int[][] matriu = new int[files][columnes];

            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    matriu[j][k] = sc.nextInt();
                }
            }

            for (int j = 0; j < files; j++) {
                int mitja = 0;
                for (int k = 0; k < columnes; k++) {
                    mitja += matriu[j][k];
                }
                mitja /= columnes;
                total[i][j] = mitja;
            }
        }

        for (int i = 0; i < repeticions; i++) {
            for (int j = 0; j < total[i].length; j++) {
                System.out.print(total[i][j] + " ");
            }
            System.out.println();
        }
    }
}