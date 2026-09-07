import java.util.Scanner;

public class p063_SumaTerminos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos terminos? ");
        int terminos = scanner.nextInt();
        double suma = 0.0;

        for (int denominador = 1; denominador <= terminos; denominador++) {
            System.out.print("1/" + denominador);
            suma += 1.0 / denominador;

            if (denominador < terminos) {
                System.out.print("+");
            }
        }

        System.out.println();
        System.out.println("Suma " + suma);
    }
}