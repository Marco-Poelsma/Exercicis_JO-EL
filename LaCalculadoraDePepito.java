import java.util.Scanner;

public class LaCalculadoraDePepito {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int casos = scan.nextInt();
        for (int i = 0; i < casos; i++) {
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            scan.nextLine();
            String op = scan.nextLine();
            switch (op) {
                case "+":
                    System.out.println(n1+n2);
                    break;
                case "-":
                    System.out.println(n1-n2);
                    break;
                case "*":
                    System.out.println(n1*n2);
                    break;
                case "/":
                    System.out.println(n1/n2);
                    break;
            }
        }
    }
}