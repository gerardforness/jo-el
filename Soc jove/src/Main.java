import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        if (edad >= 32) {
            System.out.println("NO");
        }else{
            System.out.println("SI");
        }
    }
}