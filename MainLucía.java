import java.util.Scanner;

public class MainLucía {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer número de casos
        int casos = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea en blanco después del número de casos

        for (int i = 0; i < casos; i++) {
            // Leer palabra mágica y convertirla a un array de caracteres
            String paraulaMagica = scanner.nextLine();
            char[] paraula = paraulaMagica.toCharArray();

            // Leer las letras adivinadas y convertirlas a un array de caracteres
            String endevinances = scanner.nextLine().replace(" ", "");
            char[] endevina = endevinances.toCharArray();

            int errors = 0;

            // Crear un array para mostrar la palabra con los caracteres acertados o '*'
            char[] resultat = new char[paraula.length];
            for (int j = 0; j < resultat.length; j++) {
                resultat[j] = '*'; // Inicializar con '*'
            }

            // Contar errores y construir el resultado
            for (char letraEndevina : endevina) {
                boolean encertat = false;
                for (int j = 0; j < paraula.length; j++) {
                    if (paraula[j] == letraEndevina) {
                        resultat[j] = letraEndevina; // Actualizar el carácter acertado
                        encertat = true;
                    }
                }
                if (!encertat) {
                    errors++; // Incrementar el conteo de errores si no se encontró la letra
                }
            }

            // Imprimir el resultado final y el número de errores
            System.out.print(new String(resultat));
            System.out.println(" " + errors);
        }

        scanner.close();
    }
}