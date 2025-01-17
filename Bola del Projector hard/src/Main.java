import java.util.*;

public class Main {

    // Funció que comprova si podem sumar exactament N amb qualsevol combinació de trossos
    public static boolean canSumToTarget(int[] trossos, int N) {
        // Cream un array per marcar les sumes possibles
        boolean[] possibles = new boolean[N + 1];
        possibles[0] = true; // La suma 0 és sempre possible (sense afegir cap tros)

        for (int toss : trossos) {
            // Anem actualitzant les sumes possibles en ordre decreixent per evitar comptar dues vegades un tros
            for (int i = N; i >= toss; i--) {
                if (possibles[i - toss]) {
                    possibles[i] = true;
                }
            }
        }

        return possibles[N]; // Comprovem si la suma N és possible
    }

    // Funció per resoldre el problema
    public static void resoldreProblema() {
        Scanner sc = new Scanner(System.in);
        int casosDeProva = sc.nextInt(); // Llegim el nombre de casos de prova
        String[] resultats = new String[casosDeProva];

        for (int i = 0; i < casosDeProva; i++) {
            int N = sc.nextInt(); // Distància
            int K = sc.nextInt(); // Nombre de trossos de cordill

            int[] trossos = new int[K];
            for (int j = 0; j < K; j++) {
                trossos[j] = sc.nextInt(); // Llegim cada tros de cordill
            }

            // Verifiquem si podem sumar exactament a N
            if (canSumToTarget(trossos, N)) {
                resultats[i] = "SI";
            } else {
                resultats[i] = "NO";
            }
        }
        for (int i = 0; i < resultats.length; i++) {
            System.out.println(resultats[i]);
        }

        sc.close(); // Tanquem el scanner
    }

    public static void main(String[] args) {
        resoldreProblema(); // Cridem la funció per resoldre el problema
    }
}
