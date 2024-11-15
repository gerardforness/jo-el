import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_alumnes = sc.nextInt();
        Character[] alumnes = new Character[n_alumnes];

        for (int i = 0; i < alumnes.length; i++) {
            alumnes[i] = sc.next().charAt(0);
        }

        int alumnes_total = n_alumnes;
        boolean secuencia;
        do {
            secuencia = false;
            for (int i = 0; i < alumnes.length; i++) {
                if (alumnes[i] != null && alumnes[i] == 'F' &&
                        alumnes[i + 1] != null && alumnes[i + 1] == 'S' &&
                        alumnes[i + 2] != null && alumnes[i + 2] == 'C') {

                    alumnes_total -= 3;
                    alumnes[i] = null;
                    alumnes[i + 1] = null;
                    alumnes[i + 2] = null;
                    i = 0;
                    secuencia = true;
                }
            }
        }while (secuencia);

        System.out.println(alumnes_total);
    }
}