import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<String> EXCLUDED_GAMES = Arrays.asList("Zelda", "DarkSouls", "HollowKnight", "Eclipse");

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            
            for (int i = 0; i < testCases; i++) {
                scanner.nextLine(); // consume the newline character after the integer input
                String[] games = scanner.nextLine().split(" ");
                List<String> gameList = new ArrayList<>(Arrays.asList(games));
                
                int hours = scanner.nextInt();
                int shitListLevel = 0;

                for (int j = 0; j < hours; j++) {
                    int hour = scanner.nextInt();
                    String currentGame = gameList.get(hour - 15);

                    if ("LoL".equals(currentGame)) {
                        shitListLevel += 2;
                    } else if (!EXCLUDED_GAMES.contains(currentGame)) {
                        shitListLevel++;
                    }
                }

                System.out.println("Nivell de shitlist: " + shitListLevel);
            }
        }
    }
}