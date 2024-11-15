import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ex1 = sc.nextInt();
        int ex2 = sc.nextInt();
        int ex3 = sc.nextInt();
        int actual = sc.nextInt();
        if (actual != ex1 && actual != ex2 && actual != ex3) {
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
}