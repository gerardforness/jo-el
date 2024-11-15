import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila = sc.nextInt();
        int columna = sc.nextInt();
        int[][] matrix = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        int filak = -1;
        int columnak = -1;

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (matrix[i][j] == k) {
                    filak = i;
                    columnak = j;
                }
            }
        }

        System.out.printf(filak + " " + columnak);
    }
}