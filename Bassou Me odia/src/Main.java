import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alumnes = sc.nextInt();
        String[] names = new String[alumnes];

        for (int i = 0; i < alumnes; i++) {
            names[i] = sc.next();
        }

        int bassou = 0;
        for (int i = 0; i < alumnes; i++) {
            if (names[i].equals("Bassou")) {
                bassou++;
            }
        }

        String[] meodien = new String[bassou];
        for (int i = 0; i < bassou; i++) {
            meodien[i] = "Bassou";
        }

        System.out.println(Arrays.toString(meodien));
    }
}