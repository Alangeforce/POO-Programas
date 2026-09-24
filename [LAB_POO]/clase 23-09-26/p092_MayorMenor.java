import java.util.Scanner;

public class p092_MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- p092_MayorMenor ---");
        System.out.print("Cuantos numeros deseas capturar? ");
        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Numero %d: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.print("Elementos del arreglo : ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.printf("%nEl numero mayor es: %d%n", mayor);
        System.out.printf("El numero menor es: %d%n", menor);
    }
}
