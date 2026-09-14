import java.util.Scanner;

public class p077_MedidasLongitud {
    public static double PulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }
    public static double MetrosAPies(double metros) {
        return metros * 3.281;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Opciones de conversion:");
        System.out.println("1. Pulgadas a Centimetros");
        System.out.println("2. Metros a Pies");
        System.out.print("Elige una opcion ? ");
        int opc = obj.nextInt();
        
        if (opc == 1) {
            System.out.print("Dame la cantidad en pulgadas ? ");
            double pul = obj.nextDouble();
            System.out.printf("\n%.2f pulgadas equivalen a %.2f centimetros\n", pul, PulgadasACentimetros(pul));
        } else if (opc == 2) {
            System.out.print("Dame la cantidad en metros ? ");
            double mts = obj.nextDouble();
            System.out.printf("\n%.2f metros equivalen a %.2f pies\n", mts, MetrosAPies(mts));
        } else {
            System.out.println("Opcion invalida");
        }
        obj.close();
    }
}
