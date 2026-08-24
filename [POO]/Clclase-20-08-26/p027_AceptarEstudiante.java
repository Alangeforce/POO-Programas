import java.util.Scanner;

public class p027_AceptarEstudiante {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("UNIVERSIDAD PATIO DE KSA DE CV");
        System.out.println("Control de Acceso son mayores de 18 y califiaciones mayores a 8\n");


        System.out.println("Dame tu edad : "); int edad = obj.nextInt();
        if( edad == 18 ){
            System.out.println("");
        }


    }
}
