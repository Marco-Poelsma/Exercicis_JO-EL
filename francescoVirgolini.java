import java.util.Arrays;
import java.util.Scanner;
public class francescoVirgolini {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int iteracions = scan.nextInt();
        for (int i = 0; i < iteracions; i++) {
            int cotxes = scan.nextInt();
            scan.nextLine();
            String[] ordre = new String[cotxes];
            for (int j = 0; j < cotxes; j++) {
                ordre[j] = scan.nextLine();
            }
            int index = 1;
            while (true) {
                if (ordre[index].equals("Francesco Virgolini")) {
                    ordre[index] = ordre[index-1];
                    ordre[index-1] = "Francesco Virgolini";
                    break;
                }
                index++;
            }
            System.out.println(Arrays.toString(ordre));
        }
    }
}
