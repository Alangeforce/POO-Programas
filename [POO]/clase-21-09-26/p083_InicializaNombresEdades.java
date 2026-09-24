import java.util.ArrayList;
import java.util.List;

public class p083_InicializaNombresEdades {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(
                List.of("Juan", "Pedro", "Luis", "José", "Mateo", "María"));
        ArrayList<Integer> edades = new ArrayList<>(
                List.of(22, 25, 44, 38, 50, 16));

        System.out.println("Los nombres son:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.printf("%nLas edades son:%n");
        for (int edad : edades) {
            System.out.println(edad);
        }

        System.out.printf("%nCada nombre con su respectiva edad:%n");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.printf("Nombre: %s, Edad: %d%n", nombres.get(i), edades.get(i));
        }
    }
}
