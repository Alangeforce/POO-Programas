import java.util.Scanner;

public class p050_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        do {
            int inicial, finalTemp;
            do {
                System.out.print(">>> Temperatura Inicial: ");
                inicial = scanner.nextInt();
                System.out.print(">>> Temperatura Final: ");
                finalTemp = scanner.nextInt();
                if (finalTemp < inicial) {
                    System.out.println("Error: La temperatura final no puede ser menor a la inicial.");
                }
            } while (finalTemp < inicial);
            
            System.out.println("Centígrados Fahrenheit");
            for (int c = inicial; c <= finalTemp; c++) {
                double f = (c * 9.0 / 5.0) + 32;
                System.out.printf("%d %.1f\n", c, f);
            }
            
            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = Character.toUpperCase(scanner.next().charAt(0));
        } while (continuar == 'S');
        scanner.close();
    }
}
