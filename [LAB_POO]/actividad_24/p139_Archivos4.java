import java.io.*;
import java.util.Scanner;
public class p139_Archivos4 {
    public static void main(String[] args) {
        File a = new File("nombres.txt");
        String[] nombres = {"Juan", "Pedro", "Luis", "María"};
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Crear archivo\n2. Leer y mostrar archivo");
        System.out.print("Elige una opción: ");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                if (a.exists()) System.out.println("El archivo ya existe. No se modifica.");
                else try (BufferedWriter salida = new BufferedWriter(new FileWriter(a))) {
                    for (String nombre : nombres) { salida.write(nombre); salida.newLine(); }
                    System.out.println("Archivo creado.");
                } catch (IOException e) { System.out.println(e); }
                break;
            case 2:
                if (!a.exists()) { System.out.println("Error: el archivo no existe."); break; }
                try (BufferedReader lector = new BufferedReader(new FileReader(a))) {
                    String linea;
                    while ((linea = lector.readLine()) != null) System.out.println(linea);
                } catch (IOException e) { System.out.println(e); }
                break;
            default: System.out.println("Opción inválida.");
        }
        entrada.close();
    }
}
