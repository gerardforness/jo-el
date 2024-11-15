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

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                if (matriu[i][j] == n1){
                    System.out.printf(n2 + " ");
                }else {
                    System.out.printf(matriu[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}