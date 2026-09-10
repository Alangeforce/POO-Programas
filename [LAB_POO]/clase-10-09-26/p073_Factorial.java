import java.util.Scanner;

public class p073_Factorial {
    public static double Factorial(int n) {
        double factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame un numero ? ");
        int n = scanner.nextInt();

        System.out.printf("%nEl factorial de %d es %.0f%n", n, Factorial(n));
    }
}