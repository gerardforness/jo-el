import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int F = sc.nextInt();
        int C = sc.nextInt();
        int[][] matriu = new int[F][C];

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                matriu[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        int sumafila = 0;
        int sumacolumna = 0;

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                if (i == k){
                    sumafila += matriu[i][j];
                }
                if (j == k){
                    sumacolumna += matriu[i][j];
                }
            }
        }

        System.out.println(sumafila + " " + sumacolumna);
    }
}