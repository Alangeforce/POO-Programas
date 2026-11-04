import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class p141_Archivos6 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> datos = new ArrayList<>();
    static String archivo = "nombres.dat";
    static void capturar() {
        System.out.println("Escribe datos (Enter vacío para terminar):");
        String linea;
        while (!(linea = sc.nextLine()).isEmpty()) datos.add(linea);
    }
    static void grabar() {
        if (datos.isEmpty()) { System.out.println("No hay datos para grabar."); return; }
        try (DataOutputStream salida = new DataOutputStream(new FileOutputStream(archivo))) {
            salida.writeInt(datos.size());
            for (String dato : datos) salida.writeUTF(dato);
            System.out.println("Datos grabados con éxito.");
        } catch (IOException e) { System.out.println("Error al grabar: " + e.getMessage()); }
    }
    static void leer() {
        try (DataInputStream entrada = new DataInputStream(new FileInputStream(archivo))) {
            int total = entrada.readInt();
            ArrayList<String> recuperados = new ArrayList<>();
            for (int i = 0; i < total; i++) recuperados.add(entrada.readUTF());
            datos.clear(); datos.addAll(recuperados);
            System.out.println("Datos cargados con éxito.");
        } catch (IOException e) { System.out.println("Error al leer: " + e.getMessage()); }
    }
    static void mostrar() {
        if (datos.isEmpty()) { System.out.println("No hay datos para mostrar."); return; }
        System.out.println("Datos registrados:");
        for (String dato : datos) System.out.println("- " + dato);
    }
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Procesamiento de datos ---\n[1] Capturar datos\n[2] Grabar en archivo\n[3] Leer de archivo\n[4] Mostrar datos\n[5] Salir");
            System.out.print("Elige una opción: ");
            try { opcion = Integer.parseInt(sc.nextLine()); }
            catch (NumberFormatException e) { opcion = 0; }
            switch (opcion) {
                case 1: capturar(); break;
                case 2: grabar(); break;
                case 3: leer(); break;
                case 4: mostrar(); break;
                case 5: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
        sc.close();
    }
}
