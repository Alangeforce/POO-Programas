import java.util.Scanner;

public class p064_SumaTerminos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos terminos? ");
        int terminos = scanner.nextInt();
        long termino = 0;
        long suma = 0;

        for (int contador = 1; contador <= terminos; contador++) {
            termino = termino * 10 + 1;
            System.out.print(termino);
            suma += termino;

            if (contador < terminos) {
                System.out.print("+");
            }
        }

        System.out.println();
        System.out.println("Suma " + suma);
    }
}