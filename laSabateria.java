import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class laSabateria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < testCases; i++) {
            LinkedHashMap<Integer, Integer> shoesMap = new LinkedHashMap<>();

            processInputLine(scanner, shoesMap);

            processInputLine(scanner, shoesMap);

            printResults(shoesMap);
        }
        scanner.close();
    }

    private static void processInputLine(Scanner scanner, LinkedHashMap<Integer, Integer> shoesMap) {
        String[] input = scanner.nextLine().split(", ");
        for (String item : input) {
            String[] parts = item.split(" ");
            int size = Integer.parseInt(parts[0]);
            int count = Integer.parseInt(parts[1]);
            shoesMap.put(size, shoesMap.getOrDefault(size, 0) + count);
        }
    }

    private static void printResults(LinkedHashMap<Integer, Integer> shoesMap) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : shoesMap.entrySet()) {
            result.append(entry.getKey()).append(" ").append(entry.getValue()).append(", ");
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }
        System.out.println(result);
    }
}