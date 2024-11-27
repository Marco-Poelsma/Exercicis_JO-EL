import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        int pos = 2;
        for (int i = 0; i < n; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = pos;
                    pos += 2;
                }
            } else {
                for (int j = arr.length-1; j >= 0; j--) {
                    arr[i][j] = pos;
                    pos += 2;
                }
            }
        }
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
