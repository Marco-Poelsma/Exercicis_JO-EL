import java.util.Scanner;

public class Atakhan {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int dmg = 0;
        int minut = 0;
        do { 
            String[] input = scan.nextLine().split(" ");
            minut = Integer.parseInt(input[0]);
            dmg += Integer.parseInt(input[2]);
        } while (minut != 20);
        
    }
}
