import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parells = 0;
        int imparells = 0;
        int repeticions = sc.nextInt();
        int[] nums = new int[repeticions];

        for (int i = 0; i < repeticions; i++) {
            nums [i] = sc.nextInt();
        }

        for (int i = 0; i < repeticions; i++) {
            parells = 0;
            imparells = 0;
            for (int j = 1; j <= nums[i]; j++) {
                if (j % 2 == 0) {
                    parells += j;
                }else {
                    imparells += j;
                }
            }
            System.out.println("PARELLS: " + parells  + " SENARS: " + imparells);
        }
    }
}