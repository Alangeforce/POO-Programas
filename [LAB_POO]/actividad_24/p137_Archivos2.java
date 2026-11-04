import java.io.*;
public class p137_Archivos2 {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Luis", "Jose", "Reynaldo", "Maria", "Teresa", "Rocio"};
        File a = new File("nombres.txt");
        if (a.exists()) System.out.println("El archivo ya existe.");
        else try (BufferedWriter salida = new BufferedWriter(new FileWriter(a))) {
            for (String nombre : nombres) { salida.write(nombre); salida.newLine(); }
        } catch (IOException e) { System.out.println("Error: " + e.getMessage()); }
        System.out.println("Longitud del archivo (bytes): " + a.length());
    }
}
