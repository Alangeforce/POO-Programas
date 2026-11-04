import java.io.File;
public class p136_Archivos1 {
    public static void main(String[] args) {
        File a = new File("datos.txt");
        if (!a.exists()) { System.out.println("El archivo no existe."); return; }
        System.out.println("Nombre: " + a.getName());
        System.out.println("Es directorio: " + a.isDirectory());
        System.out.println("Ruta relativa: " + a.getPath());
        System.out.println("Ruta absoluta: " + a.getAbsolutePath());
        System.out.println("Se puede leer: " + a.canRead());
        System.out.println("Se puede escribir: " + a.canWrite());
        System.out.println("Longitud: " + a.length());
        System.out.println("Última modificación (ms): " + a.lastModified());
    }
}
