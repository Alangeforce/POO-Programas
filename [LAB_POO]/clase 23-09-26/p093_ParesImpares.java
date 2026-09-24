import java.util.Random;

public class p093_ParesImpares {
    public static void main(String[] args) {
        final int MAX = 100;
        int[] a = new int[MAX];
        int[] b = new int[MAX];
        Random random = new Random();

        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(21);
        }

        int pares = 0;
        int impares = 0;

        System.out.println("--- p093_ParesImpares ---");
        System.out.println("Elementos del arreglo a[]:");
        mostrar(a);

        System.out.println("Elementos pares:");
        for (int numero : a) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                pares++;
            }
        }
        System.out.println();

        System.out.println("Elementos impares:");
        for (int numero : a) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
                impares++;
            }
        }
        System.out.println();
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }

    static void mostrar(int[] arreglo) {
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
