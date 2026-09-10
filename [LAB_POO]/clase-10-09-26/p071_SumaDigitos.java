import java.util.Scanner;

public class p071_SumaDigitos {
    public static int SumaDigitos(int n) {
        n = Math.abs(n);
        int suma = 0;

        while (n != 0) {
            suma += n % 10;
            n /= 10;
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame un numero ? ");
        int numero = scanner.nextInt();

        System.out.printf("%nLa suma de digitos es : %d%n", SumaDigitos(numero));
    }
}