import java.util.ArrayList;
import java.util.Scanner;

public class yoNoLeVoyADarDeComerAMiHijo {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int fills = scan.nextInt();
        ArrayList<Integer> edats = new ArrayList<>();
        for (int i = 0; i < fills; i++) {
            edats.add(scan.nextInt());
        }
        int minEdat = scan.nextInt();
        int i = 0;
        for (int n : edats) {
            if (n < minEdat) {
                i++;
            }
        }
        System.out.println(i);
        scan.close();
    }
}
