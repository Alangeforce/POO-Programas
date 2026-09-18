import java.util.Scanner;

public class p034_NumeroMayor {
    public static void main(String[] args) {
        int n1, n2, n3, mayor;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Verifica cual es el mayor de tres numeros");
        System.out.print("Ingresa tres numeros separados por espacio: ");
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();
        mayor = n1;
        if (n2 > mayor) mayor = n2;
        if (n3 > mayor) mayor = n3;
        System.out.printf("Resultado: El numero mayor es %d.\n", mayor);
    }
}