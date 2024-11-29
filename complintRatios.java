import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class complintRatios {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner (System.in)) {
            int casos = scan.nextInt();
            for (int i = 0; i < casos; i++) {
                int noms = scan.nextInt();
                scan.nextLine();
                String[] nombres = scan.nextLine().split(" ");
                ArrayList<String> nombres2 = new ArrayList<>();
                nombres2.addAll(Arrays.asList(nombres));
                int elimina = scan.nextInt();
                for (int j = 0; j < noms; j++) {
                    if (j != elimina) {
                        System.out.print(nombres2.get(j) + " ");
                    }
                }
            }
        }
    }
}
