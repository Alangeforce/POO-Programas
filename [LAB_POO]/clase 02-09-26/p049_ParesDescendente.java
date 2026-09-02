import java.util.Scanner;

public class p049_ParesDescendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        do {
            System.out.print(">>> Introduce el número n: ");
            int n = scanner.nextInt();
            System.out.print("Números pares entre 100 y " + n + ": ");
            int suma = 0;
            int contador = 0;
            for (int i = 100; i >= n; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    suma += i;
                    contador++;
                }
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
