import java.util.InputMismatchException;
import java.util.Scanner;

public class p135_ExcepcionTemperatura {
    public static class TemperturaExcesiva extends Exception {
        public TemperturaExcesiva(String mensaje) {
            super(mensaje);
        }
    }

    public static float convertir(float centigrados) throws TemperturaExcesiva {
        if (centigrados > 100) {
            throw new TemperturaExcesiva("Temperatura demasiado alta, no se puede convertir");
        }
        return centigrados * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Dame una temperatura en centígrados: ");
                float centigrados = obj.nextFloat();
                float fahrenheit = convertir(centigrados);
                System.out.printf("%.2f grados centígrados, equivale a %.2f grados fahrenheit%n",
                        centigrados, fahrenheit);
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("La temperatura a convertir, debe ser un valor numérico");
                obj.nextLine();
            } catch (TemperturaExcesiva e) {
                System.out.println("Error : " + e);
            }
        }
    }
}
