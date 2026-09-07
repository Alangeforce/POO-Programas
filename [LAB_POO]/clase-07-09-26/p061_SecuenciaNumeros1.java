import java.util.Scanner;

public class p061_SecuenciaNumeros1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos renglones? ");
        int renglones = scanner.nextInt();

        for (int renglon = 1; renglon <= renglones; renglon++) {
            for (int columna = 1; columna <= renglon; columna++) {
                System.out.print(renglon + " ");
            }
            System.out.println();
        }
    }
}