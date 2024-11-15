import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int repeticions = sc.nextInt();
        int[] linies = new int[repeticions];

        for (int i = 0; i < repeticions; i++) {
            linies[i] = sc.nextInt();
        }

        for (int i = 0; i < linies.length; i++) {
            for (int j = 0; j < linies[i]; j++) {
                System.out.print("No ofendre al president patata");
                System.out.println();
            }
            System.out.println();
        }
    }
}