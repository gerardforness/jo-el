import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int[] resultat = new int[casos];

        for (int i = 0; i < casos; i++) {
            int nensinicials = sc.nextInt();
            String sequencia = sc.next();
            ArrayList<Integer> nens = new ArrayList<Integer>();

            for (int j = 0; j < nensinicials; j++) {
                nens.add(j + 1);
            }
            int ultimnen = nens.get(nens.size()-1);

            for (char c : sequencia.toCharArray()) {
                if (ultimnen < nens.get(nens.size()-1)) {
                    ultimnen++;
                }

                if (c == 'S'){
                    nens.remove(0);

                }else if (c == 'N'){
                    nens.add(nens.get(0));
                    nens.remove(0);

                }else if (c == 'E'){
                    nens.add(ultimnen + 1);
                }
            }
            resultat[i] = nens.get(0);
        }
        for (int i = 0; i < resultat.length; i++) {
            System.out.println(resultat[i]);
        }
    }
}