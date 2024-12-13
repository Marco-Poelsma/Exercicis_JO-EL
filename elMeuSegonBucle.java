import java.util.Scanner;

public class elMeuSegonBucle {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int casos = scan.nextInt();
        for (int i = 0; i < casos; i++) {
            int nombres = scan.nextInt();
            for (int j = 0; j < nombres; j++) {
                int n = scan.nextInt();
                System.out.println(++n);
            }
        }
        scan.close();
    }
}
