import java.io.*;
public class p138_Archivos3 {
    public static void main(String[] args) {
        File a = new File("nombres.txt");
        if (!a.exists()) System.out.println("El archivo no existe.");
        else try (BufferedReader entrada = new BufferedReader(new FileReader(a))) {
            String linea;
            while ((linea = entrada.readLine()) != null) System.out.println(linea);
        } catch (IOException e) { System.out.println("Error: " + e.getMessage()); }
        System.out.println("Longitud del archivo (bytes): " + a.length());
    }
}
