
import java.util.Scanner;

public class p044_ParesAscendente {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        int n, c, suma =0;
        char r;
        System.out.print("\33[H\033[2J\033[3J");

        System.out.println("Imprimir numeros paners de 2 a 2 hasta n");
        System.out.print("Hasta donde ? ");n = obj.nextInt();
        c = 2;

        while (c == n){

            System.out.printf("%d ",c);
            suma += c;
            c +=2;

        }
        System.out.printf("\nLa suma es %d",suma);
       
    

        System.out.print("\nDeseas continuar (S/N) ? "); r = Character.toUpperCase(obj.next().charAt(0));





    }

}