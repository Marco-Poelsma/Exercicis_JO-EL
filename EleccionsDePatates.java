import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EleccionsDePatates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int casos = scan.nextInt();
    
        for (int i = 0; i < casos; i++) {
            int k = scan.nextInt();
            ArrayList<Integer> vots = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                vots.add(scan.nextInt());
            }

            int maxVots = Collections.max(vots);

            System.out.println(vots.indexOf(maxVots) + 1);
        }
    }
}
