import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_notes = 0;
        int total_10 = 0;
        int nota = 0;

        while (nota != -1){
            nota = sc.nextInt();
            if (nota >= 0 && nota <= 10){
                total_notes++;
            }
            if (nota == 10){
                total_10++;
            }
        }
        System.out.println("TOTAL NOTES: " + total_notes + " NOTES10: " + total_10);
    }
}