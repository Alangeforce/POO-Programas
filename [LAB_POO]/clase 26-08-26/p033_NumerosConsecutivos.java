import java.util.Scanner;

public class p033_NumerosConsecutivos {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Verifica si tres numeros son consecutivos");
        System.out.print("Ingresa tres numeros separados por espacio: ");
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();
        if (n2 == n1 + 1 && n3 == n2 + 1) {
            System.out.println("Resultado: Los numeros son consecutivos.");
        } else {
            System.out.println("Resultado: Los numeros NO son consecutivos.");
        }
    }
}