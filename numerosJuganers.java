import java.util.ArrayList;
import java.util.Scanner;

public class numerosJuganers {
    public static ArrayList<Integer> nombres = new ArrayList<>();
    public static void main(String[] args) {
        try (Scanner scan = new Scanner (System.in)) {
            while (true) {
                int n = scan.nextInt();
                if (n == 0) break;
                
                while (n > 0) {
                    nombres.add(n % 10);
                    n /= 10;
                }
                for (int i = 0; i < nombres.size()/2; i++) {
                    int aux = nombres.get(i);
                    
                }



                nombres.clear();
            }
        }
    }
}