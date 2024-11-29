import java.util.Scanner;

public class holaUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nom = scan.nextLine();
        System.out.println("Hola, " + nom);
        scan.close();
    }
}