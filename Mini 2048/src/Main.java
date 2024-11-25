import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        ArrayList<ArrayList<Integer>> resultat = new ArrayList<>();

        for (int i = 0; i < casos; i++) {
            int llargada = sc.nextInt();
            ArrayList<Integer> fila = new ArrayList<Integer>();

            for (int j = 0; j < llargada; j++) {
                fila.add(sc.nextInt());
            }

            char direccio = sc.next().charAt(0);

            if (direccio == 'L') {
                for (int j = 0; j < fila.size(); j++) {
                    if (fila.get(j) == 0) {
                        fila.remove(j);
                        fila.add(0);
                    }
                }
                for (int j = 0; j < fila.size() - 1; j++) {
                    if (fila.get(j) == fila.get(j + 1)) {
                        fila.set(j, fila.get(j) + fila.get(j + 1));
                        fila.remove(j + 1);
                        fila.add(0);
                    }
                }
            }else if (direccio == 'R') {
                for (int j = 0; j < fila.size(); j++) {
                    if (fila.get(j) == 0) {
                        fila.remove(j);
                        fila.add(0);
                    }
                }
                for (int j = 0; j < fila.size() - 1; j++) {
                    if (fila.get(j) == fila.get(j + 1)) {
                        fila.set(j, fila.get(j) + fila.get(j + 1));
                        fila.remove(j + 1);
                        fila.add(0);
                    }
                }
                for (int j = 0; j < fila.size(); j++) {
                    if (fila.get(j) == 0) {
                        fila.remove(j);
                        fila.add(0, 0);
                    }
                }
            }
            resultat.add(fila);
        }

        for (int i = 0; i < resultat.size(); i++) {
            for (int j = 0; j < resultat.get(i).size(); j++) {
                System.out.print(resultat.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}