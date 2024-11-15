import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caramels = sc.nextInt();
        int nebots = sc.nextInt();
        if (nebots == 0){
            System.out.println(0);
        }else{
            System.out.println(caramels / nebots);
        }
    }
}

