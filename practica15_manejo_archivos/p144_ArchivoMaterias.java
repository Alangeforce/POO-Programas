import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Solicita materias cursadas, las guarda en un archivo de texto y las muestra.
 */
public class p144_ArchivoMaterias {
    private static final Path ARCHIVO = Path.of("materias.txt");

    /** Guarda cada materia en una linea independiente del archivo. */
    public static void escribirMaterias(String[] materias) throws IOException {
        try (BufferedWriter escritor = Files.newBufferedWriter(ARCHIVO, StandardCharsets.UTF_8)) {
            for (String materia : materias) {
                String materiaLimpia = materia.trim();
                if (!materiaLimpia.isEmpty()) {
                    escritor.write(materiaLimpia);
                    escritor.newLine();
                }
            }
        }
    }

    /** Lee y muestra las materias almacenadas en el archivo. */
    public static void leerMaterias() throws IOException {
        try (BufferedReader lector = Files.newBufferedReader(ARCHIVO, StandardCharsets.UTF_8)) {
            String materia;
            while ((materia = lector.readLine()) != null) {
                System.out.println("- " + materia);
            }
        }
    }

    /** Ejecuta la captura, escritura y lectura de materias. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8)) {
            System.out.print("Introduce materias cursadas (separadas por coma): ");
            String entrada = scanner.nextLine().trim();

            if (entrada.isEmpty()) {
                System.out.println("No se capturaron materias.");
                return;
            }

            System.out.println("Escribiendo materias en el archivo...");
            escribirMaterias(entrada.split(","));
            System.out.println("Datos guardados con exito.");
            System.out.println("\nLeyendo materias desde el archivo:");
            leerMaterias();
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
