import java.util.Scanner;

public class p072_SumaParesImpares {
    public static int SumaParImpar(int ini, int fin, char letra) {
        int suma = 0;
        letra = Character.toUpperCase(letra);

        for (int i = ini; i <= fin; i++) {
            boolean debeSumarse = (letra == 'P' && i % 2 == 0)
                    || (letra == 'I' && i % 2 != 0);

            if (debeSumarse) {
                System.out.printf("%d ", i);
                suma += i;
            }
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor inicial ? ");
        int ini = scanner.nextInt();
        System.out.print("Valor final ? ");
        int fin = scanner.nextInt();
        System.out.print("%n[P]ares %n[I]mpares ? ");
        char poi = Character.toUpperCase(scanner.next().charAt(0));

        if (poi != 'P' && poi != 'I') {
            System.out.println("Opcion no valida.");
            return;
        }

        int suma = SumaParImpar(ini, fin, poi);
        System.out.printf("%nLa suma es : %d%n", suma);
    }
}