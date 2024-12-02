import java.util.Scanner;

public class ej1Metodos {
    public static void compteEnrere(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
    public static void benvinguda (String input) {
        System.out.println("Hola, " + input + "!");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        compteEnrere(n);
        scan.nextLine();
        String input = scan.nextLine();
        benvinguda(input);
        scan.close();
    }
}
