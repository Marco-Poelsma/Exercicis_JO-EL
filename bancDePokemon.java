import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class bancDePokemon {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner (System.in)) {
            int casos = scan.nextInt();
            int banc = scan.nextInt();
            ArrayList<Integer> pokemon = new ArrayList<>();
            ArrayList<Integer> nivells = new ArrayList<>();
            ArrayList<Integer> mateixPokemon = new ArrayList<>();
            for (int i = 0; i < casos; i++) {    
                for (int j = 0;  j < banc; j++) {
                    pokemon.add(scan.nextInt());
                }
                for (int j = 0;  j < banc; j++){
                    nivells.add(scan.nextInt());
                }
                for (int j = 0; j < banc; j++) {
                    if (Objects.equals(nivells.get(j), Collections.max(nivells))) {
                        System.out.print(pokemon.get(j));
                        if (j != banc - 1) System.out.print(" ");
                    } else {
                        mateixPokemon.clear();
                        for (int j2 = 0; j2 < banc; j2++) {
                            if (Objects.equals(pokemon.get(j2), pokemon.get(j))) {
                                mateixPokemon.add(nivells.get(j2));
                            }
                        }
                        if (j == nivells.indexOf(Collections.max(mateixPokemon)) || mateixPokemon.size() == 1) {
                            System.out.print(pokemon.get(j));
                            if (j != banc - 1) System.out.print(" ");
                        }
                    }
                }
                System.out.println();
                pokemon.clear();
                nivells.clear();
            }
            
        }
    }
}
