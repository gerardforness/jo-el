import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int files = sc.nextInt();
        int columnes = sc.nextInt();
        String[][] matriu = new String[files][columnes];
        int f1 = sc.nextInt();
        int c1 = sc.nextInt();
        int f2 = sc.nextInt();
        int c2 = sc.nextInt();

        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                if (i >= f1 && j >= c1 && i <= f2 && j <= c2) {
                    matriu[i][j] = "X";
                }else {
                    matriu[i][j] = ".";
                }
            }
        }

        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                System.out.printf(matriu[i][j] + " ");
            }
            System.out.println();
        }
    }
}