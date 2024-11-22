import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeticions = sc.nextInt();
        sc.nextLine();
        String[] paraules = new String[repeticions];
        String[] resultats = new String[repeticions];

        for (int i = 0; i < repeticions; i++) {
            paraules[i] = sc.nextLine();
        }

        for (int i = 0; i < repeticions; i++) {
            if (paraules[i].toLowerCase().equals("patata")) {
                resultats[i] = "Es Patata";
            }else{
                resultats[i] = "No es Patata";
            }
        }

        for (int i = 0; i < repeticions; i++) {
            System.out.println(resultats[i]);
        }
    }
}