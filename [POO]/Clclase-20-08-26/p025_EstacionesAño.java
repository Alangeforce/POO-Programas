import java.util.Scanner;

public class p025_EstacionesAño{
    public static void main(String[] args) {
        
       System.out.print("\033[H\033[2J");
       System.out.println(:"Dame un numero entero entre 1 y 4 y te dire que estacion del year es :");
       int num = new Scanner(System.in).nextInt();


       if( num == 1 )System.out.println("\nEs PRIMAVERA : MARZO - ABRIL -MAYO");
       if( num == 2 )System.out.println("\nEs VERANO : MARZO - ABRIL -MAYO");
       if( num == 3 )System.out.println("\nEs OTONO : MARZO - ABRIL -MAYO");
       if( num == 4 )System.out.println("\nEs PRIMAVERA : MARZO - ABRIL -MAYO");

       

    }

}