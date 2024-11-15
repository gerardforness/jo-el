import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int gran = A;
        int petit = A;
        int B = sc.nextInt();
        if (B < petit) {petit = B;}
        if (B > gran){gran = B;}
        int C = sc.nextInt();
        if (C < petit) {petit = C;}
        if (C > gran){gran = C;}
        int dif = gran - petit;
        System.out.println(dif);
    }
}