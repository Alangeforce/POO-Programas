// Verifica si un número es positivo, negativo o cero
import java.util.Scanner;

public class p021_VerificaNumero {
    public static void main(String[] args) {
        int n;
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Entrada
        System.out.println("Verifica si un número es positivo, negativo o cero\n");
        System.out.print("Dame un numero ? ");
        n = new Scanner(System.in).nextInt();

        //Proceso

        //Salida
        if (n > 0)
            System.out.println("El número es POSITIVO");
        if (n < 0)
            System.out.println("El número es NEGATIVO");
        if (n == 0)
            System.out.println("El número es CERO");
        System.out.println("\nGracias por utilizar este programa\n");
    }
}