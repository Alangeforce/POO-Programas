// Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares.Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares.

import java.util.Scanner;

public class p015_ConvertirADolares {

    public static void main(String[] args) {
        
        float pesos, cotizacion, dolar;


        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[23");

        
        System.out.println("Este Programa calcular Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares");


        //Entrada
        System.out.print("Dame la cantidad de pesos: :"); pesos = obj.nextFloat();       
        System.out.print("Dame la cotizacion del dolar :"); cotizacion = obj.nextFloat();       

        // Proceso

        dolar = pesos / cotizacion;

        // Salida

        System.out.printf("Equivalente en dólares   :  %.2f \n", dolar);
      



    }
}