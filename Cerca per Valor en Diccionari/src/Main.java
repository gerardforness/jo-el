import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        ArrayList<String> resultat = new ArrayList<>();

        for (int i = 1; i <= casos; i++) {
            int linies = sc.nextInt();
            sc.nextLine();
            String[] arraypaisciutat = PaisCiutat(sc, linies);
            arraypaisciutat = PosarIguals(arraypaisciutat);
            Arrays.sort(arraypaisciutat);
            String ciutat = sc.nextLine();
            resultat.add(StringFormatejada(arraypaisciutat));
            String paisbuscat = BusquemPais(arraypaisciutat, ciutat);
            resultat.add(paisbuscat != null ? paisbuscat : "Capital no trobada");
        }

        for (String res : resultat) {
            System.out.println(res);
        }
    }

    public static String BusquemPais(String[] arraypaisciutat, String ciutat) {
        for (String paisciutat : arraypaisciutat) {
            String[] parts = paisciutat.split("=");
            if (parts[1].equals(ciutat)) {
                return parts[0];
            }
        }
        return null;
    }

    public static String StringFormatejada(String[] arraypaisciutat) {
        StringBuilder builder = new StringBuilder("{");
        for (int i = 0; i < arraypaisciutat.length; i++) {
            builder.append(arraypaisciutat[i]);
            if (i < arraypaisciutat.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("}");
        return builder.toString();
    }

    public static String[] PosarIguals(String[] arraypaisciutat) {
        for (int i = 0; i < arraypaisciutat.length; i++) {
            arraypaisciutat[i] = arraypaisciutat[i].replace('-', '=');
        }
        return arraypaisciutat;
    }

    public static String[] PaisCiutat(Scanner sc, int n) {
        String[] arraypaisciutat = new String[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arraypaisciutat[i] = sc.nextLine();
        }
        return arraypaisciutat;
    }
}
