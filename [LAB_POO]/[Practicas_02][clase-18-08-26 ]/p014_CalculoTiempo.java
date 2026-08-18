// calcular su equivalente en días, minutos y segundos, considerando que >
// ● 1 día tiene 24 horas,
// ● 1 hora tiene 60 minutos,
/// ● 1 minuto tiene 60 segundos.

import java.util.Scanner;

public class p014_CalculoTiempo {

    public static void main(String[] args) {
        
        float dias, minutos, horas, segundos;


        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[23");

        
        System.out.println("Este Programa calcular su equivalente en días, minutos y segundos");


        //Entrada
        System.out.print("Dame la cantidad de horas: :"); horas = obj.nextFloat();

        //Calculo
        dias = horas / 24;
        minutos = horas * 60;
        segundos = horas * 60 * 60;


        // salida
        System.out.printf("Días:   :  %.2f \n", dias);
        System.out.printf("Minutos:   :  %.2f \n", minutos);
        System.out.printf("Segundos:   :  %.2f \n", segundos);

    }
}