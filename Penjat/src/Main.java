import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeticions = sc.nextInt();
        sc.nextLine();

        String[] solucions = new String[repeticions];
        int[] errorstotal = new int[repeticions];

        for (int i = 0; i < repeticions; i++) {
            String paraula = sc.nextLine();
            String intents = sc.nextLine();
            String[] lletresintents = intents.split(" ");

            char[] resolt = new char[paraula.length()];
            for (int j = 0; j < resolt.length; j++) {
                resolt[j] = '*';
            }

            int errors = 0;

            for (String intent : lletresintents) {
                char lletraIntent = intent.charAt(0);
                boolean coincidencia = false;

                for (int j = 0; j < paraula.length(); j++) {
                    if (paraula.charAt(j) == lletraIntent) {
                        resolt[j] = lletraIntent;
                        coincidencia = true;
                    }
                }

                if (!coincidencia) {
                    errors++;
                }
            }

            solucions[i] = new String(resolt);
            errorstotal[i] = errors;
        }

        for (int i = 0; i < repeticions; i++) {
            System.out.println(solucions[i] + " " + errorstotal[i]);
        }
    }
}
