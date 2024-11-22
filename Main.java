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
                switch (c) {
                    case 'b':
                        System.out.print('v');
                        break;
                    case 'v':
                        System.out.print('b');
                        break;
                    case 'B':
                        System.out.print('V');
                        break;
                    case 'V':
                        System.out.print('B');
                        break;
                    default:
                        System.out.print(c);
                        break;
                }
            }
            System.out.println();
        }
        scan.close();
    }
}