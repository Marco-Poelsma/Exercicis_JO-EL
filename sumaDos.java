import java.util.ArrayList;
import java.util.Scanner;

public class sumaDos {
    public static ArrayList<int[]> tren = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println((a+b));



        scan.close();
    }
}