import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Administra estudiantes mediante un menu y un archivo serializado.
 */
public class p145_ArchivoEstudiante {
    /** Ejecuta el menu principal del programa. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Procesa procesa = new Procesa();
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero(scanner, "Elige una opcion: ");

            switch (opcion) {
                case 1:
                    procesa.capturaDatos(scanner);
                    break;
                case 2:
                    procesa.grabarDatos();
                    break;
                case 3:
                    procesa.leerDatos();
                    break;
                case 4:
                    procesa.mostrarDatos();
                    break;
                case 5:
                    procesa.mostrarEstadisticas();
                    break;
                case 6:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }

    /** Muestra las opciones disponibles del menu. */
    private static void mostrarMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Capturar datos");
        System.out.println("2. Grabar datos");
        System.out.println("3. Leer datos");
        System.out.println("4. Mostrar datos");
        System.out.println("5. Calcular estadisticas");
        System.out.println("6. Salir");
    }

    /** Lee un entero valido desde la consola. */
    static int leerEntero(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.println("Error: introduce un numero entero.");
            scanner.next();
            System.out.print(mensaje);
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    /** Lee un decimal valido desde la consola. */
    static double leerDouble(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: introduce un numero decimal.");
            scanner.next();
            System.out.print(mensaje);
        }
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }
}

/** Representa un estudiante que puede almacenarse mediante serializacion. */
class Estudiante implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String nombre;
    private final int edad;
    private final double promedio;
    private final String sexo;

    Estudiante(String nombre, int edad, double promedio, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.sexo = sexo;
    }

    int getEdad() {
        return edad;
    }

    double getPromedio() {
        return promedio;
    }

    String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Nombre: %s | Edad: %d | Promedio: %.2f | Sexo: %s",
                nombre, edad, promedio, sexo);
    }
}

/** Realiza la captura, persistencia, consulta y estadisticas de estudiantes. */
class Procesa {
    private static final String ARCHIVO = "estudiantes.dat";
    private final ArrayList<Estudiante> estudiantes = new ArrayList<>();

    /** Captura los datos de un estudiante y los agrega al arreglo. */
    void capturaDatos(Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine().trim();
        while (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacio.");
            System.out.print("Nombre: ");
            nombre = scanner.nextLine().trim();
        }

        int edad;
        do {
            edad = p145_ArchivoEstudiante.leerEntero(scanner, "Edad: ");
            if (edad <= 0) {
                System.out.println("La edad debe ser mayor que cero.");
            }
        } while (edad <= 0);

        double promedio;
        do {
            promedio = p145_ArchivoEstudiante.leerDouble(scanner, "Promedio (0 a 10): ");
            if (promedio < 0 || promedio > 10) {
                System.out.println("El promedio debe estar entre 0 y 10.");
            }
        } while (promedio < 0 || promedio > 10);

        System.out.print("Sexo (H/M): ");
        String sexo = scanner.nextLine().trim().toUpperCase();
        while (!sexo.equals("H") && !sexo.equals("M")) {
            System.out.println("Introduce H para hombre o M para mujer.");
            System.out.print("Sexo (H/M): ");
            sexo = scanner.nextLine().trim().toUpperCase();
        }

        estudiantes.add(new Estudiante(nombre, edad, promedio, sexo));
        System.out.println("Estudiante agregado correctamente.");
    }

    /** Guarda el arreglo completo de estudiantes en un archivo binario. */
    void grabarDatos() {
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            salida.writeObject(estudiantes);
            System.out.println("Datos grabados correctamente en " + ARCHIVO + ".");
        } catch (IOException e) {
            System.out.println("Error al grabar datos: " + e.getMessage());
        }
    }

    /** Carga el arreglo de estudiantes desde el archivo binario. */
    @SuppressWarnings("unchecked")
    void leerDatos() {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            ArrayList<Estudiante> datosLeidos = (ArrayList<Estudiante>) entrada.readObject();
            estudiantes.clear();
            estudiantes.addAll(datosLeidos);
            System.out.println("Datos leidos correctamente. Registros cargados: " + estudiantes.size());
        } catch (EOFException e) {
            System.out.println("El archivo no contiene datos.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer datos: " + e.getMessage());
        }
    }

    /** Muestra todos los estudiantes que se encuentran en el arreglo. */
    void mostrarDatos() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("\n--- ESTUDIANTES ---");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    /** Calcula y muestra promedios y cantidades agrupadas por sexo. */
    void mostrarEstadisticas() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados para calcular estadisticas.");
            return;
        }

        double sumaPromedios = 0;
        int sumaEdades = 0;
        int hombres = 0;
        int mujeres = 0;

        for (Estudiante estudiante : estudiantes) {
            sumaPromedios += estudiante.getPromedio();
            sumaEdades += estudiante.getEdad();
            if (estudiante.getSexo().equals("H")) {
                hombres++;
            } else if (estudiante.getSexo().equals("M")) {
                mujeres++;
            }
        }

        System.out.println("\n--- ESTADISTICAS ---");
        System.out.printf(Locale.US, "Promedio de calificaciones: %.2f%n",
                sumaPromedios / estudiantes.size());
        System.out.printf(Locale.US, "Promedio de edades: %.2f anios%n",
                (double) sumaEdades / estudiantes.size());
        System.out.println("Cantidad de hombres: " + hombres);
        System.out.println("Cantidad de mujeres: " + mujeres);
    }
}
