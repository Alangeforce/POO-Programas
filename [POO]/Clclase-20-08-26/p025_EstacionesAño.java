import java.util.Scanner;

public class p025_EstacionesAño {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Entrada
        System.out.println("Dame un numero entero entre 1 y 4 y te dire que estacion del year es :");
        int num = new Scanner(System.in).nextInt();

        //Proceso

        //Salida
        if (num == 1) {
            System.out.println("\nEs PRIMAVERA : MARZO - ABRIL - MAYO");
        } else if (num == 2) {
            System.out.println("\nEs VERANO : JUNIO - JULIO - AGOSTO");
        } else if (num == 3) {
            System.out.println("\nEs OTONO : SEPTIEMBRE - OCTUBRE - NOVIEMBRE");
        } else if (num == 4) {
            System.out.println("\nEs INVIERNO : DICIEMBRE - ENERO - FEBRERO");
        } else {
            System.out.println("\nNumero invalido, debe ser entre 1 y 4");
        }
    }
}