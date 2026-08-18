// convertir una temperatura de grados fahrenheit a grados celsius

import java.util.Scanner;

public class p012_ConvertirTemperatura {
    public static void main(String[] args) {

        float celcius, farenheit;
        
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[23");

        System.out.println("Este Programa covierte los farenheit a grados celcius");

        // Entrada 
        System.out.print("Dame los grados farenheit :"); farenheit = obj.nextFloat();

        // [PROCESO] formula de celsius = (fahrenheit – 32) * (5/9).
        celcius = (farenheit - 32  ) * (5f/9f);
 
        // Salida 
        System.out.printf("los grados farenheit a celius es  :  %.2f \n", celcius);

    }

}