// Imprime la tabla de multiplicar que el usuario pida, desde 1 hasta n
import java.util.Scanner;

public class p042_TablaMultiplicar {
    public static void main(String[] args) {
        int c, t, n;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Entrada
        System.out.println("Imprimir la tabla deseada de 1 a 10\n");
        System.out.print("Que tabla quieres ? ");
        t = obj.nextInt();
        System.out.print("Hasta donde ? ");
        n = obj.nextInt();
        c = 1;

        //Proceso
        //Salida
        while (c <= n) {
            System.out.printf("%d x %d = %d\n", t, c, c * t);
            c++;
        }
        System.out.println("\nProceso terminado ...");
    }
}