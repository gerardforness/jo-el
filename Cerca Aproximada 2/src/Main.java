import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int[] resultats = new int[casos];

        for (int i = 0; i < casos; i++) {
            int[] array_sabates = new int[sc.nextInt()];
            int total = 0;
            for (int j = 0; j < array_sabates.length; j++) {
                array_sabates[j] = sc.nextInt();
            }
            int meva_mida = sc.nextInt();
            int marge = sc.nextInt();
            int min = meva_mida - marge;
            int max = meva_mida + marge;

            for (int j = 0; j < array_sabates.length; j++) {
                if (array_sabates[j] >= min && array_sabates[j] <= max) {
                    total ++;
                }
            }

            resultats[i] = total;
        }

        for (int i = 0; i < resultats.length; i++) {
            System.out.println(resultats[i]);
        }
    }
}