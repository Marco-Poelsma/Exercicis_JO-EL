import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int torres = input.nextInt();
        int[] arr = new int[torres];
        for (int i = 0; i <= torres-1 ; i++) {
            arr[i] = input.nextInt();
        }
        for(int i : arr){
            int aux=0;
            for (int j = 1; j <= i; j++) {
                aux += j*j;
            }

            System.out.println(aux);
        }
    }
}
