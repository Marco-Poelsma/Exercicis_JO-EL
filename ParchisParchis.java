import java.util.Scanner;

public class ParchisParchis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();

        for (int i = 0; i < casos; i++) {
            int casellaFinal = scan.nextInt();
            boolean flag = false;
            for (int j = 0; j < 3; j++) {
                int tirada = scan.nextInt();
                if (!flag) {
                    casellaFinal += tirada;
                    if (casellaFinal > 8) {
                        casellaFinal = 8 - (casellaFinal - 8);
                    }
                    if (casellaFinal == 8) {
                        flag = true;
                    }
                }
            }
            System.out.println(casellaFinal);
        }
    }
}
