import java.util.ArrayList;
import java.util.Scanner;

public class nombresDeUsuario {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Character> letras = new ArrayList<>();
        String nombre = scan.nextLine().toLowerCase();
        for (int i = 0; i < nombre.length(); i++) {
            if (Character.isAlphabetic(nombre.charAt(i))) {
                if (!letras.contains(nombre.charAt(i))) {
                    letras.add(nombre.charAt(i));
                }
            } else continue;
            if (letras.size() == 9) break;
        }
        if (letras.size() == 9) {
            for (char c : letras) {
                System.out.print(c);
            }
        } else {
            int repes = 0;
            int longitud = 0;
            for (int i = 0; i <= letras.size(); i++) {
                if (i != letras.size()) {
                    System.out.print(letras.get(i));
                } else {
                    System.out.print(repes);
                    repes++;
                    i = -1;
                }
                longitud++;
                if (longitud == 9) break;
            }
        }
        scan.close();
    }
}