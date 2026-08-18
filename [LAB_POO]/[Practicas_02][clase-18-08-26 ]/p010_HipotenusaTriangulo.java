// calucla la hipotenusa de un triangulo rectangulo dados sus lados

import java.util.Scanner;

public class p010_HipotenusaTriangulo {

    public static void main(String[] args) {

        float longitudLado1, longitudLado2;
        float hipotenusa;
    

        Scanner obj = new Scanner(System.in);


        System.out.print("\033[H\033[23");
        System.out.println("Este programa calcula la hipotenusa de un triangulo rectangulo dadosus lados");

        // Entrada 
        System.out.print("Dame el valor del lado 1:"); longitudLado1 = obj.nextFloat();
        System.out.print("Dame el valor del lado 2:"); longitudLado2 = obj.nextFloat();

        // Proceso
        hipotenusa = (float) Math.sqrt( longitudLado1 *  longitudLado1 + longitudLado2 * longitudLado2);

        
        // Salida 
        System.out.printf("Hipotenusa :  %.2f \n", hipotenusa);
    }

}

