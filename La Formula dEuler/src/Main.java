import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeticions = sc.nextInt();
        int[][] resultats = new int[repeticions][];

        //INICI PROGRAMA
        for (int i = 0; i < repeticions; i++) {
            int n = sc.nextInt();   //creem variable de la llargada de la nostra array
            resultats[i] = new int[n/2];
            int[] nums = new int[n];    //definim una array amb la llargada establida per l'usuari

            //plenem la array amb els numeros donats
            for (int j = 0; j < n; j++) {
                nums[j] = sc.nextInt();
            }

            //Nem a ordenar la array de petita a gran
            for (int j = 0; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] > nums[k]) {
                        int cambio = nums[j];
                        nums[j] = nums[k];
                        nums[k] = cambio;
                    }
                }
            }
            //sumem el primer amb l'utim, el segon amb el penultim... i ho afegim a resultats
            for (int j = 0; j < nums.length / 2; j++) {
                resultats[i][j] = nums[j] + nums[nums.length - 1 - j];
            }
        }

        // Imprimir valores
        for (int i = 0; i < resultats.length; i++) {
            for (int j = 0; j < resultats[i].length; j++) {
                System.out.print(resultats[i][j] + " ");
            }
            System.out.println();
        }
    }
}