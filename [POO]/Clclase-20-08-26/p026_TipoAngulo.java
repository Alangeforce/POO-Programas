import java.util.Scanner;

public class p026_TipoAngulo {

    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Entrada
        System.out.println("Dame un angulo entre 0 y 360 grados y te dire que tipo es :");
        int ang = new Scanner(System.in).nextInt();

        if(ang >=0 && ang <=360){
            // Si el angulo es correcto se procesa
            System.out.print("\nEl angulo que me diste no es valido");
            if( ang < 90 ) System.out.println("Agudo");
            if( ang == 90  ) System.out.println("Recto");
            if( ang > 90 && ang < 180 ) System.out.println("OBTUSO");
            if( ang == 180 ) System.out.println("LLANO");
            if( ang > 180 ) System.out.println("CONCAVO");

        }
        else //Si el angulo no es correcto manda este mensaje de error s
            System.out.println();





    }
}