import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int monedes = sc.nextInt();  
            int comenca = sc.nextInt();  
            if (monedes % 4 == 0) {
                if (comenca == 0) {
                    System.out.println("GANGPLANK");
                } else {
                    System.out.println("JO");
                }
            } else {
                if (comenca == 0) {
                    System.out.println("JO");
                } else {
                    System.out.println("GANGPLANK");
                }
            }
        }
        
        sc.close();
    }
}
