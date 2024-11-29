import java.util.Scanner;

public class arrodoniment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota = scan.nextDouble();
        int notaFinal = (int) Math.round(nota);
        System.out.println(notaFinal);

    }
}