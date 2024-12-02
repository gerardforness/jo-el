import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        String[] resultat = new String[casos];

        for (int i = 0; i < casos; i++) {
            int numtasques = sc.nextInt();
            int posicioimportant = sc.nextInt();
            sc.nextLine();
            ArrayList<Integer> posicionsinicials = new ArrayList<>();
            ArrayList<String> posiciotasques = new ArrayList<>();

            for (int j = 0; j < numtasques; j++) {
                posicionsinicials.add(sc.nextInt());
                String tasca = sc.nextLine();
                posiciotasques.add(tasca);
            }

            ArrayList<Integer> posicionsfinales = new ArrayList<>(posicionsinicials);
            Collections.sort(posicionsfinales);
            int busquem = posicionsfinales.get(posicioimportant - 1);

            int tascafinal = 0;
            for (int j = 0; j < numtasques; j++) {
                if (posicionsinicials.get(j) == busquem) {
                    tascafinal = j;
                    break;
                }
            }

            resultat[i] = posiciotasques.get(tascafinal);
        }
        for (int i = 0; i < resultat.length; i++) {
            System.out.println(resultat[i]);
        }
    }
}