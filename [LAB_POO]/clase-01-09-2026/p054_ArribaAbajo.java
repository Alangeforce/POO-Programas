import java.util.Scanner;

public class p054_ArribaAbajo {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.printf("\033[H\033[2J");

        int n;
        System.out.println("[ 1 ] imprime de 1 a n ");
        System.out.println("[ 2 ] imprime de n a 1 ");
        System.out.print("Elige:  "); int op = obj.nextInt();

        switch(op) {
            case 1:
                System.out.println("Imprime de 1 a n ");
                System.out.print("\nHasta donde?"); n=obj.nextInt();
                for ( int i=1; i <= n; i++) System.out.printf("%d ", i);
                break;
            case 2:
                System.out.println("Imprime de n a 1 ");
                System.out.print("\nDe donde a donde?"); n=obj.nextInt();
                for ( int i=n; i >= 1; i--) System.out.printf("%d ", i);

                break;
            default:


        }
        System.out.println("\nProceso Terminado");
    }
}
