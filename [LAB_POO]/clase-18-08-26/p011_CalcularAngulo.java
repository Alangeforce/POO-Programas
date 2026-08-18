// calcular el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo

import java.util.Scanner;

public class p011_CalcularAngulo {
    public static void main(String[] args) {

        float angulo1, angulo2;
        float angulo3;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[23");

        System.out.println("Este Programa calcula el 3er angulo de un triangulo");

        // Entrada 
        System.out.print("Dame el valor del angulo 1:"); angulo1 = obj.nextFloat();
        System.out.print("Dame el valor del angulo 2:"); angulo2 = obj.nextFloat();


        // Proceso
        angulo3 = 180 - (angulo1+angulo2);

        // Salida 
        System.out.printf("Angulo 3 :  %.2f \n", angulo3);
    }


}