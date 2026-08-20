// Verificar si la suma de dos números es igual a un tercero
import java.util.Scanner;

public class p022_VerificaSuma {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        //Entrada
        System.out.println("Verificar si la suma de dos numeros es igual a un tercero\n");
        System.out.println("Dame el primer numero"); n1 = obj.nextInt();
        System.out.println("Dame el segundo numero"); n2 = obj.nextInt();
        System.out.println("Dame el tercer numero"); n3 = obj.nextInt();

        //Proceso

        //Salida
        if (n1 + n2 == n3)
            System.out.println("\nSon iguales");
        else
            System.out.println("\nSon distintos");
        System.out.println("\nGracias por utilizar este programa");
    }
}