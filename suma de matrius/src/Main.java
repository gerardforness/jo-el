import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mida_matriu = sc.nextInt();
        int[][] matriu1 = new int[mida_matriu][mida_matriu];
        int[][] matriu2 = new int[mida_matriu][mida_matriu];
        int[][] matriuTotal = new int[mida_matriu][mida_matriu];

        for (int i = 0; i < matriu1.length; i++) {
            for (int j = 0; j < matriu1[i].length; j++) {
                matriu1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriu2.length; i++) {
            for (int j = 0; j < matriu2[i].length; j++) {
                matriu2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriuTotal.length; i++) {
            for (int j = 0; j < matriuTotal[i].length; j++) {
                matriuTotal[i][j] = matriu1[i][j] + matriu2[i][j];
                System.out.printf(matriuTotal[i][j] + " ");
            }
            System.out.println();
        }
    }
}