import java.util.Scanner;

public class p078_SumaMultiplos {
    public static int SumaMultiplos(int ini, int fin, int constante) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % constante == 0) {
                System.out.printf("%d ", i);
                suma += i;
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        int ini, fin, constante;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Valor inicial ? "); ini = obj.nextInt();
        System.out.print("Valor final ? "); fin = obj.nextInt();
        
        if (ini > fin) {
            int temp = ini;
            ini = fin;
            fin = temp;
        }

        System.out.print("Constante multiplo ? "); constante = obj.nextInt();
        System.out.println("\nMultiplos:");
        int suma = SumaMultiplos(ini, fin, constante);
        System.out.printf("\nLa suma de los multiplos de %d es : %d\n", constante, suma);
        obj.close();
    }
}
