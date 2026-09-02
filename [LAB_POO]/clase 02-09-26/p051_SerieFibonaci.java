import java.util.Scanner;

public class p051_SerieFibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;
        do {
            System.out.print(">>> ¿Número de términos que deseas imprimir?: ");
            int n = scanner.nextInt();
            System.out.println("Los primeros " + n + " términos de la sucesión Fibonacci son:");
            
            int a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
            
            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = Character.toUpperCase(scanner.next().charAt(0));
        } while (continuar == 'S');
        scanner.close();
    }
}
