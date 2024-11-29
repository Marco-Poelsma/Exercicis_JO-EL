import java.util.*;

public class terceraPosicio {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int tamany = scan.nextInt();
    int[][] terreny = new int[tamany][tamany];
    int pins = scan.nextInt();
    for (int i = 0; i < pins; i++) {
        int x = scan.nextInt();
        int y = scan.nextInt();
        terreny[x][y] = 1;
    }
    //Encontrar cuadrado de máximo tamanyo que no contenga 1
    int maxTamany = 0;
    for (int i = 0; i < tamany; i++) {
            for (int j = 0; j < tamany; j++) {
                if (terreny[i][j] == 0) {
                    int tamanyActual = 1;
                    for (int k = j + 1; k < tamany; k++) {
                        if (terreny[i][k] == 0) {
                            tamanyActual++;
                        } else {
                            break;
                        }
                    }
                    for (int k = i + 1; k < tamany; k++) {
                        if (terreny[k][j] == 0) {
                            tamanyActual++;
                        } else{
                            break;
                        }
                    }
        maxTamany = Math.max(maxTamany, tamanyActual);
            }
        }
    }
    System.out.println(maxTamany);                            

    scan.close();
    }
}
