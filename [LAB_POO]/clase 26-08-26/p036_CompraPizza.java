import java.util.Scanner;

public class p036_CompraPizza {
    public static void main(String[] args) {
        String tamano;
        int cantidad;
        double precioUnitario = 0, totalCompra, descuento = 0, totalPagar;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Compra de Pizza - Calculo con descuento");
        System.out.print("Tamano (chica/mediana/grande): ");
        tamano = obj.next().toLowerCase();
        System.out.print("Cantidad: ");
        cantidad = obj.nextInt();

        switch (tamano) {
            case "chica": precioUnitario = 5; break;
            case "mediana": precioUnitario = 10; break;
            case "grande": precioUnitario = 20; break;
            default:
                System.out.println("Tamano no valido");
                return;
        }

        totalCompra = precioUnitario * cantidad;
        if (totalCompra > 2000) {
            descuento = totalCompra * 0.15;
        }
        totalPagar = totalCompra - descuento;

        System.out.printf("Tamano de la compra: %s\n", tamano);
        System.out.printf("Cantidad comprada: %d\n", cantidad);
        System.out.printf("Total compra: %.1f\n", totalCompra);
        System.out.printf("Descuento (15%%): %.1f\n", descuento);
        System.out.printf("Total a pagar: %.1f\n", totalPagar);
    }
}