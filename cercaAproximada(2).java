import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int times = input.nextInt(); 
        ArrayList<Integer> results = new ArrayList<>();

        for (int i = 0; i < times; i++) {
            int loop = input.nextInt(); 
            int[] tallas = new int[loop];
            input.nextLine(); 
            String[] entry = input.nextLine().split(" ");
            for (int j = 0; j < loop; j++) {
                tallas[j] = Integer.parseInt(entry[j]);
            }

            String[] abuscar_aux = input.nextLine().split(" ");
            int objetivo = Integer.parseInt(abuscar_aux[0]);
            int rango = Integer.parseInt(abuscar_aux[1]);

            int lowerBound = objetivo - rango; 
            int upperBound = objetivo + rango; 
            int count = 0;

            for (int talla : tallas) {
                if (talla >= lowerBound && talla <= upperBound) {
                    count++;
                }
            }

            results.add(count); 
        }

        for (int result : results) {
            System.out.println(result);
        }
    }
}
