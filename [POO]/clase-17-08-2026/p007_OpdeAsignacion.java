// Demostrar el uso de los operadores de asignacion e incremento

import java.util.Scanner;

public class p007_OpdeAsignacion {
    public static void main(String[] args) {
        

        System.out.print("\033[H\033[2]");
        System.err.println("Ejemplo del uso de los operadores de asignacion e incremento\n");

        System.out.print("Dame un numero entero:");
        float num = new Scanner(System.in).nextInt();
        System.out.printf("El valor original es :   %.2f \n", num);
        System.out.printf("Incrementar en 1 :       %.2f \n", ++num);
        System.out.printf("Sumar 80 :             %.2f \n", num+=80);
        System.out.printf("Restar 35 :               %.2f \n", num-=35);
        System.out.printf("Multiplicar 15 :          %,.2f \n", num*=15);
        System.out.printf("Dividir entre 4 :          %.2f \n", num/=4);
        System.out.printf("Decrementar en 1 :        %.2f \n", --num);

    }

}