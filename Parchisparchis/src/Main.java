import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeticions = sc.nextInt();
        int[] resultats = new int[repeticions];

        for (int i = 0; i < repeticions; i++) {
            int posicio = sc.nextInt();
            int[] moviments = new int[3];

            for (int j = 0; j < 3; j++) {
                moviments[j] = sc.nextInt();
            }

            for (int j = 0; j < 3; j++) {
                posicio += moviments[j];
                if (posicio > 8) {
                    posicio = 8 - (posicio - 8);
                }else if (posicio == 8) {
                    break;
                }else{}
            }

            resultats[i] = posicio;
        }
        for (int i = 0; i < repeticions; i++) {
            System.out.println(resultats[i]);
        }
    }
}