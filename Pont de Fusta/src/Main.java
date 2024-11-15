import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int[] resultats = new int[casos];

        for (int i = 0; i < casos; i++) {
            int longitud = sc.nextInt();
            int taulons = 0;
            taulons += longitud / 2 * 3;
            taulons += longitud % 2;
            resultats[i] = taulons;
        }

        for (int i = 0; i < casos; i++) {
            System.out.println(resultats[i]);
        }
    }
}