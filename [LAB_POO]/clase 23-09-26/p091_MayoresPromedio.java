import java.util.Scanner;

public class p091_MayoresPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- p091_MayoresPromedio ---");
        System.out.print("Cuantas calificaciones deseas capturar? ");
        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        float[] calificaciones = new float[cantidad];
        float suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.printf("Calificacion %d: ", i + 1);
            calificaciones[i] = scanner.nextFloat();
            suma += calificaciones[i];
        }

        float promedio = suma / calificaciones.length;
        System.out.print("Elementos del arreglo : ");
        mostrar(calificaciones);
        System.out.printf("Suma: %.1f%n", suma);
        System.out.printf("Promedio: %.1f%n", promedio);
        System.out.print("Elementos mayores al promedio: ");

        int mayores = 0;
        for (float calificacion : calificaciones) {
            if (calificacion > promedio) {
                System.out.printf("%.1f ", calificacion);
                mayores++;
            }
        }

        System.out.printf("%nTotal de elementos mayores al promedio: %d%n", mayores);
    }

    static void mostrar(float[] arreglo) {
        for (float elemento : arreglo) {
            System.out.printf("%.1f ", elemento);
        }
        System.out.println();
    }
}
