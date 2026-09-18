import java.util.Scanner;

public class p035_ContinentesMundo {
    public static void main(String[] args) {
        int num;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Continentes del mundo (1-6)");
        System.out.print("Ingresa numero de continente (1-6): ");
        num = obj.nextInt();
        System.out.print("Resultado: ");
        switch (num) {
            case 1: System.out.println("Asia"); break;
            case 2: System.out.println("Africa"); break;
            case 3: System.out.println("America del Norte"); break;
            case 4: System.out.println("America del Sur"); break;
            case 5: System.out.println("Antartida"); break;
            case 6: System.out.println("Europa"); break;
            default: System.out.println("Error: numero fuera de rango (1-6)"); break;
        }
    }
}