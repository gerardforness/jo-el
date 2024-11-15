import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int[] resultats = new int[casos];

        for (int i = 0; i < casos; i++) {
            int linies = sc.nextInt();
            int bitlles = 0;
            for (int j = 0; j <= linies; j++) {
                bitlles += j;
            }
            resultats[i] = bitlles;
        }

        for (int i = 0; i < casos; i++) {
            System.out.println(resultats[i]);
        }
    }
}