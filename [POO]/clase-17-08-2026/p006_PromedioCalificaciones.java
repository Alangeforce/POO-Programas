// Calcula la suma y promedio de 3 calificaciones, asi como la mayor y menor

import java.util.Scanner;

public class p006_PromedioCalificaciones {

    public static void main(String[] args) {
        float c1, c2, c3;
        Scanner obj = new Scanner(System.in);

        System.out.printf("Calculando el promedio de 3 calificaciones\n");
        System.out.printf("Dame calificacion 1 : "); c1 = obj.nextFloat();
        System.out.printf("Dame calificacion 2 : "); c2 = obj.nextFloat();
        System.out.printf("Dame calificacion 3 : "); c3 = obj.nextFloat();

        float suma = c1 + c2 + c3;
        float promedio = suma / 3;
        float mayor = Math.max(c1, Math.max(c2, c3));
        float menor = Math.min(c1, Math.min(c2, c3));

        System.out.printf("Las calificaciones son: %.2f, %.2f, %.2f\n", c1, c2, c3);
        System.out.printf("La suma es = %.2f \n", suma);
        System.out.printf("El promedio es = %.2f \n", promedio);
        System.out.printf("La mayor es = %.2f \n", mayor);
        System.out.printf("La menor es = %.2f \n", menor);
    }
}