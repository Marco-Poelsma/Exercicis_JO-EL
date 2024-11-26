import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int rondas = scan.nextInt();
        boolean error = false;
        int intentsBoomersA = 0, descarregaBoomersA = 0, intentsMilenialsA = 0, descarregaMilenialsA = 0, intentsBoomersB = 0, descarregaBoomersB = 0, intentsMilenialsB = 0, descarregaMilenialsB = 0;
        for (int i = 0; i < rondas; i++) {
            intentsBoomersA += scan.nextInt();
            int intents = intentsBoomersA;
            descarregaBoomersA += scan.nextInt();
            int descarrega = descarregaBoomersA;
            error = descarrega > intents || error;
            intentsMilenialsA += scan.nextInt();
            intents = intentsMilenialsA;
            descarregaMilenialsA += scan.nextInt();
            descarrega = descarregaMilenialsA;
            error = descarrega > intents || error;
            intentsBoomersB += scan.nextInt();
            intents = intentsBoomersB;
            descarregaBoomersB += scan.nextInt();
            descarrega = descarregaBoomersB;
            error = descarrega > intents || error;
            intentsMilenialsB += scan.nextInt();
            intents = intentsMilenialsB;
            descarregaMilenialsB += scan.nextInt();
            descarrega = descarregaMilenialsB;
            error = descarrega > intents || error;
        }
        if (error) {
            System.out.println("ERROR");
        } else {
            if ((descarregaBoomersA + descarregaMilenialsA) > (descarregaBoomersB + descarregaMilenialsB)) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
            if ((descarregaBoomersA + descarregaBoomersB) > (descarregaMilenialsA + descarregaMilenialsB)) {
                System.out.println("BOOMERS");
            } else {
                System.out.println("MILENIALS");
            }
        }
    }
}