import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int[] resultats = new int[casos];

        for (int i = 0; i < casos; i++) {
            String numeros = sc.next();
            int total = 0;
            for (int j = 0; j < numeros.length(); j++) {
                int digito = Character.getNumericValue(numeros.charAt(j));
                total += digito;
            }
            resultats[i] = total;
        }

        for (int i = 0; i < resultats.length; i++) {
            System.out.println(resultats[i]);
        }
    }
}