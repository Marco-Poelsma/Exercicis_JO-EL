import java.util.Scanner;

public class topuriaVsHolloway {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int topuria = 0;
        int holloway = 0;
        String cop = "";
        int segons = 0;
        for (int i = 0; i < 5; i++) {
            segons = 0;
            while (segons < 300) { 
                char lluitador = scan.nextLine().charAt(0);
                if (lluitador == 'T') {
                    cop = scan.nextLine();
                    if (cop.equals("LK")) {
                        topuria+=2;
                        segons += 50;
                    } else if (cop.equals("J")) {
                        topuria += 5;
                        segons += 150;
                    } else if (cop.equals("G")) {
                        topuria += 10;
                        segons += 200;
                    } else if (cop.equals("KO") && i >= 2) {
                        System.out.println("Topuria WINS (KO)");
                        break;
                    } else {
                        topuria--;
                        segons += 120;
                    }
                } else {
                    cop = scan.nextLine();
                    if (cop.equals("LK")) {
                        holloway+=2;
                        segons += 50;
                    } else if (cop.equals("J")) {
                        holloway += 5;
                        segons += 150;
                    } else if (cop.equals("G")) {
                        holloway += 10;
                        segons += 200;
                    } else if (cop.equals("KO") && i >= 2) {
                        System.out.println("Holloway WINS (KO)");
                        break;
                    } else {
                        holloway--;
                        segons += 120;
                    }
                }
            }
            if (cop.equals("KO") && i >= 2) break;
        }
        if (!cop.equals("KO")) {
            if (topuria > holloway) {
                System.out.println("Topuria WINS " + topuria + " - " + holloway);
            } else if (holloway > topuria) {
                System.out.println("Holloway WINS " + holloway + " - " + topuria);
            } else {
                System.out.println("DRAW " + topuria + " - " + holloway);
            }
        }
    }
}