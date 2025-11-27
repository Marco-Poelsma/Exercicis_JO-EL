import java.util.Scanner;

public class ApostesEsportives {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();

        for (int i = 0; i < casos; i++) {
            int gols = scan.nextInt();
            int dGols = scan.nextInt();

            int casa = (gols + dGols) / 2;
            int fora = gols - casa;
            if (gols + dGols < 0 || gols - dGols < 0 || (gols + dGols) % 2 != 0) {
                System.out.println("error");
            } else {
                System.out.println(casa + " " + fora);
            }

        }
    }
}
