import java.util.Scanner;

public class p070_MayorTresNumeros {
    public static float Mayor(float n1, float n2, float n3) {
        return Math.max(n1, Math.max(n2, n3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dame tres numeros separados por espacio ? ");
        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();

        System.out.printf("%nEl mayor de los tres numeros es : %.2f%n", Mayor(n1, n2, n3));
    }
}