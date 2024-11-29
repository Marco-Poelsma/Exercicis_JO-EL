import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class continuara {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int casos = scan.nextInt();
            scan.nextLine();
            for (int i = 0; i < casos; i++) {
                ArrayList<String> palabras = new ArrayList<>(Arrays.asList(scan.nextLine().split(" ")));
                for (int j = 0; j < palabras.size()-1; j++) {
                    System.out.print(palabras.get(j));
                    if (palabras.get(j).length() < palabras.get(j+1).length()) System.out.print("... ");
                    else System.out.print(" ");
                }
                System.out.println(palabras.get(palabras.size()-1));
            }
        }
    }
}
