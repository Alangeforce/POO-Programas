import java.util.Scanner;

public class p055_SumaParesImpares {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int op;
        do {
            System.out.printf("\033[H\033[2J");

            int n, suma = 0;
            System.out.println("[ 1 ] imprime los pares y su suma ");
            System.out.println("[ 2 ] imprime los impares");
            System.out.println("[ 3 ] Salir");

            System.out.print("Elige:  ");
            int op = obj.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Imprime pares y su suma de 1 a n ");
                    System.out.print("\nImprime pares y su suma de 1 a n?");
                    n = obj.nextInt();
                    for (int i = 2; i <= n; i += 2) {
                        System.out.printf("%d ", i);
                        suma += i;

                    }
                    System.out.println("La suma es : " + suma);
                    break;
                case 2:
                    System.out.println("Imprime impares y su suma de 1 a n ");
                    System.out.print("\nDe donde a donde?");
                    n = obj.nextInt();
                    for (int i = 1; i <= n; i += 2) {
                        System.out.printf("%d ", i);
                        suma += i;
                    }
                    System.out.println("La suma es : " + suma);
                    break;
                case 3:
                    System.out.println("\nCaile Pues...");
                    break;
                default:

            }
            System.out.println("\nPresiona [ENTER] para seguir");
            obj.nextLine();
            obj.nextLine();
            System.out.println("\nProceso Terminado");
        }while (op != 3);
    }
}
