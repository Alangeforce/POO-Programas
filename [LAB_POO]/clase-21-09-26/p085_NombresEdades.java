import java.util.ArrayList;
import java.util.Scanner;

public class p085_NombresEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        System.out.print("Cuantos nombres deseas procesar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.printf("Dame el nombre %d: ", i + 1);
            nombres.add(scanner.nextLine());
            System.out.print("Dame su edad: ");
            edades.add(scanner.nextInt());
            scanner.nextLine();
        }

        int suma = 0;
        System.out.printf("%nNombre\tEdad%n");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.printf("%s\t%d%n", nombres.get(i), edades.get(i));
            suma += edades.get(i);
        }

        int promedio = edades.isEmpty() ? 0 : suma / edades.size();
        System.out.printf("%nEl promedio de edades es %d%n", promedio);
    }
}
