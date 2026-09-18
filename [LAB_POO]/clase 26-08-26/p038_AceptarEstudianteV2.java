import java.util.Scanner;

public class p038_AceptarEstudianteV2 {
    public static void main(String[] args) {
        String nombre;
        char sexo;
        int edad;
        float c1, c2, c3, promedio;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Universidad Kitty Kat SA - Admision");
        System.out.print("Nombre: ");
        nombre = obj.nextLine();
        System.out.print("Sexo (h/m): ");
        sexo = Character.toLowerCase(obj.next().charAt(0));
        System.out.print("Edad: ");
        edad = obj.nextInt();
        System.out.print("Calificaciones (3 separadas por espacio): ");
        c1 = obj.nextFloat();
        c2 = obj.nextFloat();
        c3 = obj.nextFloat();
        promedio = (c1 + c2 + c3) / 3;
        System.out.printf("\nPromedio: %.1f\n", promedio);
        if (sexo == 'm' && edad > 21 && promedio >= 8 && promedio <= 9.5) {
            System.out.println("Resultado: Estudiante aceptada.");
        } else {
            System.out.println("Resultado: Estudiante NO aceptada.");
            if (sexo != 'm') System.out.println("- Debe ser mujer (m)");
            if (edad <= 21) System.out.println("- Debe ser mayor de 21");
            if (promedio < 8 || promedio > 9.5) System.out.println("- Promedio debe estar entre 8 y 9.5");
        }
    }
}