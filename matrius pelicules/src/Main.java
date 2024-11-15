import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] pelis = new String[4][3];

        for (int i = 0; i < pelis.length; i++){
            for (int j = 0; j < pelis[i].length; j++){
                pelis[i][j] = sc.nextLine();
            }
        }

        for (int i = 0; i < pelis.length; i++) {
            for (int j = 0; j < pelis[i].length; j++) {
                System.out.printf(pelis[i][j] + " ");
            }
            System.out.println();
        }
    }
}