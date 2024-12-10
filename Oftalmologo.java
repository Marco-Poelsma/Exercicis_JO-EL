import java.util.Scanner;

public class Oftalmologo {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int[][] numeros = {{1, 2}, {3, 4}};
        int[][] aux = new int[2][2];
        char[] input = scan.nextLine().toCharArray();
        for (char c : input) {
            if (c == 'H') {
                for (int i = 0; i < numeros.length; i++) {
                    aux[0][i] = numeros[1][i];
                    aux[1][i] = numeros [0][i];
                }
                for (int i = 0; i < numeros.length; i++) {
                    for (int j = 0; j < numeros.length; j++) {
                        numeros[i][j] = aux[i][j];
                    }
                }
            } else {
                for (int i = 0; i < numeros.length; i++) {
                    aux[i][0] = numeros[i][1];
                    aux[i][1] = numeros [i][0];
                }
                for (int i = 0; i < numeros.length; i++) {
                    for (int j = 0; j < numeros.length; j++) {
                        numeros[i][j] = aux[i][j];
                    }
                }
            }
        }
        for (int[] fila : numeros) {
            for (int n : fila) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
