import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int eur2 = n / 200;
        n = n % 200;
        int eur1 = n / 100;
        n = n % 100;
        int cent50 = n / 50;
        n = n % 50;
        int cent20 = n / 20;
        n = n % 20;
        int cent10 = n / 10;
        n = n % 10;
        int cent5 = n / 5;
        n = n % 5;
        int cent2 = n / 2;
        n = n % 2;
        int cent1 = n / 1;
        System.out.println(eur2);
        System.out.println(eur1);
        System.out.println(cent50);
        System.out.println(cent20);
        System.out.println(cent10);
        System.out.println(cent5);
        System.out.println(cent2);
        System.out.println(cent1);
    }
}