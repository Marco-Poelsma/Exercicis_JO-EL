import java.util.Scanner;

public class trianguloDePascal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long iterations = scan.nextLong();
        long sum = calculatePascalSum(iterations);
        printPascalTriangle(iterations);
        System.out.println("Suma: " + sum);
        scan.close();
    }

    public static long calculatePascalSum(long n) {
        int sum = 0;
        for (long p = 1, m = n - 1, d = 1; d <= n; p = p * m / d, --m, ++d) {
            sum += p;
        }
        return sum;
    }

    public static void printPascalTriangle(long n) {
        for (long i = 1; i <= n; i++) {
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