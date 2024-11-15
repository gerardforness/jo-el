import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jiden = sc.nextInt();
        int drump = sc.nextInt();
        if (jiden > drump) {
            System.out.println("Jiden");
        }else if (drump > jiden) {
            System.out.println("Drump");
        }else {
            System.out.println("No");
        }
    }
}