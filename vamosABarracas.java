import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class vamosABarracas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amics = scan.nextInt();
        int[][] dies = new int[amics][5];
        for (int[] fila : dies) {
            for (int i = 0; i < fila.length; i++) {
                fila[i] = 0;
            }
        }
        scan.nextLine();
        for (int i = 0; i < amics; i++) {
            String input = scan.nextLine();
            for (int j = 0; j < input.length(); j++) {
                char c =  input.charAt(j);
                if (c == 'Y') dies[i][j] = 1;
            }
        }
        ArrayList<Integer> diesDisponibles = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int amicsDisponibles = 0;
            for (int j = 0; j < amics; j++) {
                if (dies[j][i] != 0) amicsDisponibles++;
            }
            diesDisponibles.add(amicsDisponibles);
        }
        int maxDisponibles = Collections.max(diesDisponibles);
        ArrayList<Integer> diesMaxDisponibles = new ArrayList<>();
        for (int i = 0; i < diesDisponibles.size(); i++) {
            if (diesDisponibles.get(i) == maxDisponibles) {
                diesMaxDisponibles.add(i+1);
            }
        }
        System.out.println(String.join(",", diesMaxDisponibles.stream().map(String::valueOf).toArray(String[]::new)));
        scan.close();
    }
}
