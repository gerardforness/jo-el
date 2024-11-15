import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeticions = sc.nextInt();
        int[] resultat = new int[repeticions];
        for (int i = 0; i < repeticions; i++) {
            int[] alçades = new int[sc.nextInt()];
            for (int j = 0 ; j < alçades.length ; j++){
                alçades[j] = sc.nextInt();
            }

            Arrays.sort(alçades);
            int diferencia = alçades[alçades.length-1] - alçades[0];
            resultat[i] = diferencia;
        }

        for (int i = 0; i < repeticions; i++) {
            System.out.println(resultat[i]);
        }
    }
}