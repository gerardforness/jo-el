import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();

        String[] frases = new String[casos];

        for (int i = 0; i < casos; i++) {
            String frase = sc.nextLine();
            char[] newFrase = frase.toCharArray();

            for (int j = 0; j < frase.length(); j++) {
                if (frase.charAt(j) == 'b'){
                    newFrase[j] = 'v';
                }else if (frase.charAt(j) == 'v'){
                    newFrase[j] = 'b';
                }else if (frase.charAt(j) == 'B'){
                    newFrase[j] = 'V';
                }else if (frase.charAt(j) == 'V'){
                    newFrase[j] = 'B';
                }
            }

            frase = new String(newFrase);
            frases[i] = frase;
        }

        for (int i = 0; i < casos; i++) {
            System.out.println(frases[i]);
        }
    }
}