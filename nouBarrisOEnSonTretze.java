import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class nouBarrisOEnSonTretze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nouBarris = {"Vallbona", "Torre Baró", "La Trinitat Vella", "Verdum", "Les Roquetes", "La Prosperitat", "La Guineueta", "Canyelles", "Ciutat Meridiana"};
        ArrayList<String> barris = new ArrayList<>(Arrays.asList(nouBarris));
        String input = scan.nextLine();
        scan.close();
        if (barris.contains(input)) System.out.println("SI");
        else System.out.println("NO");
        
    }
}
