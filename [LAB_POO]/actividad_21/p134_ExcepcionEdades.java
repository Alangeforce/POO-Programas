import java.util.InputMismatchException;
import java.util.Scanner;

public class p134_ExcepcionEdades {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] edades = new int[5];

        System.out.println("# Captura las edades de 5 personas:");
        for (int i = 0; i < edades.length; i++) {
            boolean valido = false;
            while (!valido) {
                try {
                    System.out.printf("Edad persona %d: ", i + 1);
                    edades[i] = obj.nextInt();
                    valido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un número entero");
                    obj.next();
                }
            }
        }

        System.out.println("# Captura terminada las edades son:");
        for (int edad : edades) {
            System.out.printf("%d ", edad);
        }
        System.out.println();
    }
}
