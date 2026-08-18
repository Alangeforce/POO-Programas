// calcular el volumen de un cilindro dado su radio y altura,

import java.util.Scanner;

public class p013_VolumenCilindro { 
    public static void main(String[] args) {

        float radio, altura; 
        float volumen;

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[23");

        System.out.println("Este Programa calcula el volumen de un cilindro ddo su radio y altura");


        // Entrada 
        System.out.print("Dame el radio :"); radio = obj.nextFloat();
        System.out.print("Dame la altura :"); altura = obj.nextFloat();

        // Proceso volumen = PI * (radio * radio) * altura
        volumen = (float) Math.PI * (radio * radio) * altura;

        // Salida 
        System.out.printf("El volumen es  :  %.2f \n", volumen);




    }

}