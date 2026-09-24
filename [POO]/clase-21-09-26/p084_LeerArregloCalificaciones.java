import java.util.ArrayList;
import java.util.Scanner;

public class p084_LeerArregloCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> calificaciones = new ArrayList<>();

        System.out.print("Cuantas calificaciones deseas procesar? ");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.printf("Calificacion %d: ", i + 1);
            calificaciones.add(scanner.nextFloat());
        }

        float suma = 0;
        System.out.printf("%nLa lista de calificaciones capturadas es:%n");
        for (float calificacion : calificaciones) {
            System.out.printf("%.2f ", calificacion);
            suma += calificacion;
        }

        float promedio = calificaciones.isEmpty() ? 0 : suma / calificaciones.size();
        System.out.printf("%nLa suma es %.2f%n", suma);
        System.out.printf("El promedio es %.2f%n", promedio);
    }
}
