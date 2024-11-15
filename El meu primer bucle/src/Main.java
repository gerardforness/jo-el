import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int repeticions = sc.nextInt();
        int[] nums = new int[repeticions];

        for (int i = 0; i < repeticions; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < repeticions; i++) {
            System.out.println(nums[i] + 1);
        }
    }
}