import java.util.Scanner;

public class sumaDePatates_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int casos = scan.nextInt();
        int total = 0;
        for (int i = 0; i < casos; i++) {
            total += scan.nextInt();
        }
        System.out.println(total);
    }
}
