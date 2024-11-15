import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeticions = sc.nextInt();
        int[][] total = new int[repeticions][2];

        for (int i = 0; i < repeticions; i++) {
            int files = sc.nextInt();
            int columnes = sc.nextInt();
            int[][] matriu = new int[files][columnes];

            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    matriu[j][k] = sc.nextInt();
                }
            }

            int gran = 0;
            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    if (matriu[j][k] > gran) {
                        gran = matriu[j][k];
                        total[i][0] = j + 1;
                        total[i][1] = k + 1;
                    }
                }
            }
        }
        for (int i = 0; i < total.length; i++) {
            for (int j = 0; j < total[i].length; j++) {
                System.out.print(total[i][j] + " ");
            }
            System.out.println();
        }
    }
}