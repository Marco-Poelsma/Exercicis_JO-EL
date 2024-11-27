import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int iterations = scan.nextInt();
        int sum = calculatePascalSum(iterations);
        printPascalTriangle(iterations);
        System.out.println("Sum: " + sum);
        scan.close();
    }

    public static int calculatePascalSum(int n) {
        int sum = 0;
        for (int p = 1, m = n - 1, d = 1; d <= n; p = p * m / d, --m, ++d) {
            sum += p;
        }
        return sum;
    }

    public static void printPascalTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printPascalNthRow(i);
        }
    }

    public static void printPascalNthRow(int n) {
        for (int p = 1, m = n - 1, d = 1; d <= n; p = p * m / d, --m, ++d) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}