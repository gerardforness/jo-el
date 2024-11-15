import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j1 = sc.nextInt();
        int j2 = sc.nextInt();
        if ((j1 == 1 || j1 == 2 || j1 == 3) && (j2 == 1 || j2 == 2 || j2 == 3)) {
            if (j1 == j2){
                System.out.println("EMPAT");
            }else if (j1 == 1 && j2 == 2){
                System.out.println("Jugador2");
            }else if (j1 == 1 && j2 == 3){
                System.out.println("Jugador1");
            }else if (j1 == 2 && j2 == 1){
                System.out.println("Jugador1");
            }else if (j1 == 2 && j2 == 3){
                System.out.println("Jugador2");
            }else if (j1 == 3 && j2 == 1){
                System.out.println("Jugador2");
            }else if (j1 == 3 && j2 == 2){
                System.out.println("Jugador1");
            }
        }else {
            System.out.println("ERROR");
        }
    }
}