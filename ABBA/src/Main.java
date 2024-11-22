import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        String[] resultats = new String[casos];

        for (int i = 0; i < casos; i++) {
            String grup = sc.nextLine();
            String[] integrants = grup.split(", ");
            String[] ultims = integrants[integrants.length-1].split("i ");

            char[] inicials = new char[integrants.length + 1];

            for (int j = 0; j < integrants.length - 1; j++) {
                inicials[j] = integrants[j].charAt(0);
            }
            inicials[inicials.length-2] = ultims[0].charAt(0);
            inicials[inicials.length-1] = ultims[1].charAt(0);

            String nomgrup = new String(inicials);
            resultats[i] = nomgrup;
        }

        for (int i = 0; i < casos; i++) {
            System.out.println(resultats[i]);
        }
    }
}