import java.util.Scanner;
public class Bitlles1_intro {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int iteracions = scan.nextInt();
        for (int i = 0; i < iteracions; i++) {
            int files = scan.nextInt();
            int total = 0;
            for (int j = 1; j <= files; j++) {
                total+=j;
            }
            System.out.println(total);
        }
    }
}