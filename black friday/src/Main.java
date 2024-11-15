import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int files = sc.nextInt();
        int columnes = sc.nextInt();
        int[][] matriu = new int[files][columnes];

        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                matriu[i][j] = sc.nextInt();
            }
        }

        int multiplicador = sc.nextInt();

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] *= multiplicador;
            }
        }

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
    }
}