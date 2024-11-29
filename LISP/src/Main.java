import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        String[] resultats = new String[casos];

        for (int i = 0; i < casos; i++) {
            String text = sc.nextLine();
            int balance = 0;
            boolean balanceado = true;

            for (char c : text.toCharArray()) {
                if (c == '('){ balance++; }
                else if (c == ')'){
                    balance--;
                    if (balance < 0){
                        balanceado = false;
                    }
                }
            }

            if (balance != 0){
                balanceado = false;
            }
            if (balanceado){
                resultats[i] = "si";
            }else {
                resultats[i] = "no";
            }
        }

        for (int i = 0; i < resultats.length; i++) {
            System.out.println(resultats[i]);
        }
    }
}