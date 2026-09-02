import java.util.Scanner;

public class p048_ImparesAscendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        do {
            System.out.print(">>> Introduce el número n: ");
            int n = scanner.nextInt();
            System.out.print("Números impares entre 1 y " + n + ": ");
            int suma = 0;
            int contador = 0;
            for (int i = 1; i <= n; i += 2) {
                System.out.print(i + " ");
                suma += i;
                contador++;
            }
            System.out.println("\nSuma: " + suma);
            double promedio = contador > 0 ? (double) suma / contador : 0;
            System.out.println("Promedio: " + promedio);
            
            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = Character.toUpperCase(scanner.next().charAt(0));
        } while (continuar == 'S');
        scanner.close();
    }
}
