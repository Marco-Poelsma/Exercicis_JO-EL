import java.util.Scanner;
public class triangles {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double altura = scan.nextDouble();
        double base = scan.nextDouble();
        System.out.println((altura*base)/2.0);
    }
}