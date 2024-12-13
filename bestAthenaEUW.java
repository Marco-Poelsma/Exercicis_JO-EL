import java.util.Scanner;

public class bestAthenaEUW {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int casos = scan.nextInt();
        for (int i = 0; i < casos; i++) {
            int files = scan.nextInt();
            int columnes = scan.nextInt();
            int[][] posicions = new int[files][columnes];
            for (int j = 0; j < files; j++) {
                for (int k = 0; k < columnes; k++) {
                    posicions[j][k] = scan.nextInt();
                }
            }
            int coordenadaX = scan.nextInt();
            int coordenadaY = scan.nextInt();
            if (posicions[coordenadaX][coordenadaY] != 1) System.out.println(-1);
            else {
                int cont = 0;
                if (comprovaCaselles(coordenadaX-1, coordenadaY-1, posicions)) cont++;
                if (comprovaCaselles(coordenadaX, coordenadaY-1, posicions)) cont++;
                if (comprovaCaselles(coordenadaX+1, coordenadaY-1, posicions)) cont++;
                if (comprovaCaselles(coordenadaX-1, coordenadaY, posicions)) cont++;
                if (comprovaCaselles(coordenadaX, coordenadaY, posicions)) cont++;
                if (comprovaCaselles(coordenadaX+1, coordenadaY, posicions)) cont++;
                if (comprovaCaselles(coordenadaX-1, coordenadaY+1, posicions)) cont++;
                if (comprovaCaselles(coordenadaX, coordenadaY+1, posicions)) cont++;
                if (comprovaCaselles(coordenadaX+1, coordenadaY+1, posicions)) cont++;
                System.out.println(cont);
            } 
        }
    }
    public static boolean comprovaCaselles(int x, int y, int[][] posicions) {
        try {
            if (posicions[x][y] == 2) return true;
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
