import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positius = 0;
        int negatius = 0;
        int n = 1;

        while (n != 0){
            n = sc.nextInt();
            if (n > 0){
                positius++;
            }else if (n < 0){
                negatius++;
            }
        }

        if (positius > negatius){
            System.out.println("POSITIUS");
        }else if (negatius > positius){
            System.out.println("NEGATIUS");
        }else {
            System.out.println("IGUALS");
        }
    }
}