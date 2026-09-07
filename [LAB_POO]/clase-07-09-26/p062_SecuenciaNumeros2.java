import java.util.Scanner;

public class p062_SecuenciaNumeros2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos renglones? ");
        int renglones = scanner.nextInt();

        for (int renglon = 1; renglon <= renglones; renglon++) {
            for (int numero = 1; numero <= renglon; numero++) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }
}