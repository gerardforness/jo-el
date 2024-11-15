import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        if (c1 == c2 && c1 == c3){
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }
    }
}