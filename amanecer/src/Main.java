import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seg = sc.nextInt();
        int h = seg % 86400;
        int dia = (seg / 86400) + 1;
        if (h < 43200){
            System.out.println("mati del dia " + dia);
        }else{
            System.out.println("nit del dia " + dia);
        }
    }
}