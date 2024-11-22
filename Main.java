import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int casos = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < casos; i++) {
            //Canviar "b" per "v" i "v" per "b"
            String frase = scan.nextLine();
            for (char c : frase.toCharArray()) {
                if (c == 'b') {
                    System.out.print('v');
                } else if (c == 'v') {
                    System.out.print('b');
                } else if (c == 'B') {
                    System.out.print('V');
                } else if (c == 'V') {
                    System.out.print('B');
                } else {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
        scan.close();
    }
}