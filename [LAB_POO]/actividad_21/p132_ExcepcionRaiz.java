import java.util.Scanner;

public class p132_ExcepcionRaiz {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Introduce un número: ");
                float numero = Float.parseFloat(obj.nextLine());
                if (numero < 0) {
                    throw new IllegalArgumentException();
                }
                System.out.printf("El resultado es: %.2f%n", Math.sqrt(numero));
                valido = true;
            } catch (Exception e) {
                System.out.println("Error no puedo calcular la raíz cuadrada");
            }
        }
    }
}
