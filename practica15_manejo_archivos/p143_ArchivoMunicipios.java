import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Escribe una lista constante de deportes en un archivo de texto y la muestra.
 */
public class p143_ArchivoMunicipios {
    private static final Path ARCHIVO = Path.of("deportes.txt");
    private static final String[] DEPORTES = {
        "Futbol", "Beisbol", "Ciclismo", "Atletismo", "Natacion", "Motociclismo"
    };

    /** Escribe los deportes constantes en el archivo. */
    public static void escribirDatos() throws IOException {
        try (BufferedWriter escritor = Files.newBufferedWriter(ARCHIVO, StandardCharsets.UTF_8)) {
            for (String deporte : DEPORTES) {
                escritor.write(deporte);
                escritor.newLine();
            }
        }
    }

    /** Lee y muestra cada linea del archivo. */
    public static void leerDatos() throws IOException {
        try (BufferedReader lector = Files.newBufferedReader(ARCHIVO, StandardCharsets.UTF_8)) {
            String deporte;
            while ((deporte = lector.readLine()) != null) {
                System.out.println(deporte);
            }
        }
    }

    /** Ejecuta la escritura y lectura del archivo con manejo de errores. */
    public static void main(String[] args) {
        try {
            System.out.println("Escribiendo datos en el archivo...");
            escribirDatos();
            System.out.println("Datos escritos correctamente.");
            System.out.println("\nLeyendo datos del archivo:");
            leerDatos();
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
