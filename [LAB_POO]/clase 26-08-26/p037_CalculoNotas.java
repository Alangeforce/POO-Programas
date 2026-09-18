import java.util.Scanner;

public class p037_CalculoNotas {
    public static void main(String[] args) {
        float c1, c2, c3, c4, c5, promedio;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Calculo de promedio de 5 calificaciones");
        System.out.print("Ingresa 5 calificaciones separadas por espacio: ");
        c1 = obj.nextFloat();
        c2 = obj.nextFloat();
        c3 = obj.nextFloat();
        c4 = obj.nextFloat();
        c5 = obj.nextFloat();
        promedio = (c1 + c2 + c3 + c4 + c5) / 5;
        System.out.printf("Promedio: %.1f\n", promedio);
        System.out.print("Resultado: ");
        if (promedio > 0 && promedio <= 6) {
            System.out.println("Quedas reprobado");
        } else if (promedio > 6 && promedio <= 7) {
            System.out.println("Pasas de panzazo");
        } else if (promedio > 7 && promedio <= 8) {
            System.out.println("Muy bien, pues mejorar");
        } else if (promedio > 8 && promedio <= 9) {
            System.out.println("Excelente sigue asi");
        } else if (promedio > 9 && promedio <= 10) {
            System.out.println("Perfecto tu esfuerzo valio la pena");
        } else {
            System.out.println("Promedio fuera de rango");
        }
    }
}