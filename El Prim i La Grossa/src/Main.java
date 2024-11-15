import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeticions = sc.nextInt();
        int[] resultats = new int[repeticions];

        for (int i = 0; i < repeticions; i++) {
            int importt = sc.nextInt();
            int[] peticions = new int[100];

            // omplim la array amb les peticions
            for (int j = 0; j < peticions.length; j++) {
                int input = sc.nextInt();
                if (input > 0) {
                    peticions[j] = input;
                }else {
                    break;
                }
            }

            //Nem a ordenar les peticions de petita a gran
            for (int j = 0; j <peticions.length-1; j++){
                for (int k = j +1; k <peticions.length; k++){
                    if (peticions[j]>peticions[k]){
                        int cambio = peticions[j];
                        peticions[j] = peticions[k];
                        peticions[k] = cambio;
                    }
                }
            }

            //Mirem quantes peticions podem cumplir
            int total = 0;
            int peticions_cumplides = 0;
            for (int j = 0; j < peticions.length; j++) {
                if (peticions[j] > 0) {
                    total += peticions[j];
                    if (total <= importt) {
                        peticions_cumplides++;
                    }else{
                        break;
                    }
                }else {}
            }

            //afegim el resultat a la array de resultats
            resultats[i] = peticions_cumplides;
        }

        for (int i = 0; i < repeticions; i++) {
            System.out.println(resultats[i]);
        }
    }
}