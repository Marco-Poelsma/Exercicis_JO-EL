import java.util.Scanner;

public class Atakhan {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int dmg = 0;
        int minut = 0;
        int recompteTop = 0;
        int recompteBot = 0;
        String[] input = new String[3];
        do { 
            input = scan.nextLine().split(" ");
            minut = Integer.parseInt(input[0]);
            if (minut <= 14) {
                dmg += Integer.parseInt(input[2]);
            }
            if (input[1].toLowerCase().equals("top")) {
                recompteTop++;
            } else if (input[1].toLowerCase().equals("bot")) {
                recompteBot++;
            }
        } while (minut != 20);
        System.out.print("Tot el mon a ");
        if (recompteBot > recompteTop) {
            System.out.print("Bot ");
        } else {
            System.out.print("Top ");
        }
        System.out.print("que ha sortit Atkhan ");
        if (dmg >= 10000) {
            System.out.println("Vermell.");
        } else {
            System.out.println("Negre.");
        }
    }
}
