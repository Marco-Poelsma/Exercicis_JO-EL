import java.util.Scanner;
public class caramelsSobrants {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int nCaramels = scan.nextInt();
        int nNens = scan.nextInt();
        System.out.println((nCaramels%nNens));
    }
}