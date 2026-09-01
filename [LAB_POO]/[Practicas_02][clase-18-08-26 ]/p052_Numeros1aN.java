import java.util.Scanner;

public class p052_Numeros1aN {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.println("\nImprime los numeros  del 1 a N con for");


        System.out.print("Hasta Donde? :"); int n = obj.nextInt();
        System.out.print("Incrementos ? :"); int m = obj.nextInt();
        for(int x=0; x <= 20 ; x += m) {
            System.out.println(x);

        }
        System.out.println();
    }
}