import java.util.Scanner;

public class totsDiferents {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int casos = scan.nextInt();
        for (int i = 0; i < casos; i++) {
            int nombres = scan.nextInt();
            int[] input1 = new int[nombres];
            int[] input2 = new int[nombres];
            for (int j = 0; j < nombres; j++) {
                input1[j] = scan.nextInt();
            }
            for (int j = 0; j < input2.length; j++) {
                input2[j] = scan.nextInt();
            }
            boolean iguals = false;
            for (int j = 0; j < input2.length; j++) {
                iguals = input1[j] == input2[j];
                if (iguals) {
                    System.out.println("NO");
                    break;
                }
            }
            if (!iguals) System.out.println("SI");
        }
    }
}
