import java.util.Scanner;

public class p053_NumerosNa1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.println("\nImprime los numeros  del N a 1 con for");


        System.out.print("Donde empiezas? :"); int n = obj.nextInt();
        System.out.print("Decrementos ? :"); int m = obj.nextInt();
        for(int x=0; x <= x ; x -= m) {
            System.out.println(x);

        }
        System.out.println();
    }
}
