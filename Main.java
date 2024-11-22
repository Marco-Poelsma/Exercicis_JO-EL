import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int casos = scan.nextInt();
        for (int i = 0; i < casos; i++) {
            int nCiclistes = scan.nextInt();
            ArrayList<Integer> peloton = new ArrayList<>();
            for (int j = 0; j < nCiclistes; j++) {
               peloton.add(scan.nextInt() * scan.nextInt() / scan.nextInt()); 
            }
            System.out.println((peloton.indexOf(Collections.max(peloton)) +1));
        }
    }
}