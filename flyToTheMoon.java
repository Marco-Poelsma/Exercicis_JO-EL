import java.util.Scanner;

public class flyToTheMoon {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                int bults = scan.nextInt();
                if (bults == 0) break;
                int pes = 0;
                for (int i = 0; i < bults; i++) {
                    pes += scan.nextInt();
                }
                int combustible = calculateCombustible(pes);
                while (combustible != 0) {
                    int newCombustible = calculateCombustible(combustible + pes);
                    if (newCombustible == combustible) break;
                    combustible = newCombustible;
                }
                System.out.println(combustible);
            }
        }
    }

    private static int calculateCombustible(int pes) {
        return (pes / 7) + (pes % 7 != 0 ? 1 : 0);
    }
}