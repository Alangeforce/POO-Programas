// Calcula la paga de un trabajador segun las horas trabajadas y el pago por hora (v2)
import java.util.Scanner;

public class p024_PagaTrabajadorv2 {
    public static void main(String[] args) {
        float horas, pago, paga;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Entrada
        System.out.println("Calcula la paga de un trabajador segun las horas trabajadas y el pago por hora\n");
        System.out.print("Dame las horas trabajadas ? "); horas = obj.nextFloat();
        System.out.print("Dame el pago por hora ? "); pago = obj.nextFloat();

        //Proceso
        paga = horas * pago;

        //Salida
        System.out.printf("\nLa paga del trabajador es: %.2f\n", paga);
        System.out.println("\nGracias por utilizar este programa");
    }
}