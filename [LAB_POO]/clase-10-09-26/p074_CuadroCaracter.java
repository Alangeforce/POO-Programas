import java.util.Scanner;

public class p074_CuadroCaracter {
    public static void Cuadro(int ren, int col, char car) {
        for (int i = 1; i <= ren; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.printf("%c ", car);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Renglones ? ");
        int ren = scanner.nextInt();
        System.out.print("Columnas ? ");
        int col = scanner.nextInt();
        System.out.print("Caracter ? ");
        char car = Character.toUpperCase(scanner.next().charAt(0));

        Cuadro(ren, col, car);
    }
}