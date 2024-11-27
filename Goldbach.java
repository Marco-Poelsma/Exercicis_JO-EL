import java.util.*;

public class Goldbach {

    public static int MAX = 1000000;

    public static ArrayList<Integer> primes = new ArrayList<>();

    public static void primos() {
        boolean[] marked = new boolean[MAX / 2 + 100];

        for (int i = 1; i <= (Math.sqrt(MAX) - 1) / 2; i++) {
            for (int j = (i * (i + 1)) << 1; j <= MAX / 2; j = j + 2 * i + 1) {
                marked[j] = true;
            }
        }

        primes.add(2);

        for (int i = 1; i <= MAX / 2; i++) {
            if (!marked[i]) {
                primes.add(2 * i + 1);
            }
        }
    }

    public static void findPrimes(int n) {
        if (n < 2) {
            System.out.println("NO");
            return;
        }

        boolean found = false; // To track if we found a valid pair
        for (int i = 0; primes.get(i) <= n; i++) {
            int diff = n - primes.get(i);

            // Check if diff is prime using binary search for efficiency
            if (diff >= 2 && Collections.binarySearch(primes, diff) >= 0) {
                System.out.println(primes.get(i) + " " + diff);
                found = true;
                break; // We can stop after finding the first valid pair
            }
        }

        if (!found) {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        primos();
        Scanner scan = new Scanner(System.in);
        findPrimes(scan.nextInt());
        scan.close();
    }
}