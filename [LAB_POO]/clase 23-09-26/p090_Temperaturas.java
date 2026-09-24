public class p090_Temperaturas {
    public static void main(String[] args) {
        float[] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};

        System.out.println("--- p090_Temperaturas ---");
        System.out.printf("Primer elemento : %.2f%n", temperaturas[0]);
        System.out.printf("Tercer elemento : %.2f%n", temperaturas[2]);
        System.out.print("Elementos del arreglo : ");
        mostrar(temperaturas);

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > 10) {
                temperaturas[i] = 0;
            }
        }

        System.out.print("Elementos modificados : ");
        mostrar(temperaturas);
    }

    static void mostrar(float[] arreglo) {
        for (float elemento : arreglo) {
            System.out.printf("%.2f ", elemento);
        }
        System.out.println();
    }
}
