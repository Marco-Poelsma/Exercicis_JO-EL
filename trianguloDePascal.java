import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            long rows = scan.nextLong();
            long sum = calculatePascalSum(rows);
            printPascalTriangle(rows);
            System.out.println("Suma: " + sum);
        }
    }

    public static long calculatePascalSum(long n) {
        long sum = 0;
        for (long i = 0; i <= n; i++) {
            sum += calculatePascalNthRowSum(i);
        }
        return sum;
    }

    public static long calculatePascalNthRowSum(long n) {
        long sum = 0;
        for (long p = 1, m = n - 1, d = 1; d <= n; p = p * m / d, --m, ++d) {
            sum += p;
        }
        return sum;
    }

    public static void printPascalTriangle(long n) {
        for (long i = 0; i < n; i++) {
            printPascalNthRow(i);
        }
    }

    public static void printPascalNthRow(long n) {
        for (long p = 1, m = n - 1, d = 1; d <= n; p = p * m / d, --m, ++d) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}