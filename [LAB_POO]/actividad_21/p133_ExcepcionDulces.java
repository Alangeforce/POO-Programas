import java.util.InputMismatchException;
import java.util.Scanner;

public class p133_ExcepcionDulces {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Número de niños en el barrio: ");
                int ninos = obj.nextInt();
                System.out.print("Cantidad de dulces existente: ");
                int dulces = obj.nextInt();
                int dulcesPorNino = ninos / dulces;
                System.out.printf("A cada niño le tocan %d dulces.%n", dulcesPorNino);
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Los niños y los dulces, deben ser cantidades numéricas");
                obj.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Si no hay dulces, no puedo repartir dulces");
            }
        }
    }
}
