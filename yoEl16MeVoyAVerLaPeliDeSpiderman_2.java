import java.util.Scanner;

public class yoEl16MeVoyAVerLaPeliDeSpiderman_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int f = scan.nextInt();
        int c = scan.nextInt();
        String[][] assignatures = new String[f][c];
        scan.nextLine();
        for (int i = 0; i < assignatures.length; i++) {
            assignatures[i] = scan.nextLine().split(" ");
        }
        int posX = 0;
        int posY = 0;
        for (int i = 0; i < assignatures.length; i++) {
            for (int j = 0; j < assignatures[i].length; j++) {
                if (assignatures[i][j].equals("SPIDERMAN")) {
                    posX = i;
                    posY = j;
                    break;
                }
            }
        }
        try {
            System.out.println(assignatures[posX-1][posY]);
        } catch (Exception e) {
            System.out.println("NO");
        }
        try {
            System.out.println(assignatures[posX+1][posY]);
        } catch (Exception e) {
            System.out.println("NO");
        }
    }
}
