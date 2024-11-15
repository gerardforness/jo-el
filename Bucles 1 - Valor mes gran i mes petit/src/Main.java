import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gran = -100000;
        int petit = 100000;
        int n;

        do {
            n = sc.nextInt();
            if (n != 0) {
                if (n > gran) {
                    gran = n;
                }
                if (n < petit) {
                    petit = n;
                }
            }
        } while (n != 0);

        System.out.println(gran + " " + petit);
    }
}