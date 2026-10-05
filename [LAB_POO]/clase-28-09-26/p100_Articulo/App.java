package p100_Articulo;

public class App {
    public static void main(String[] args) {
        Articulo a1 = new Articulo("A101", "Pluma Roja", 888, 0.08);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println(a1);

        a1.setCant(999);
        a1.setPrecioUnit(0.99);
        System.out.println(a1);

        System.out.println("Id es: " + a1.getId());
        System.out.println("Desc es: " + a1.getDesc());
        System.out.println("Cant es: " + a1.getCant());
        System.out.println("PrecioUnit es: " + a1.getPrecioUnit());
        System.out.println("El Total es: " + a1.getTotal());

        System.out.println();
        System.out.println("Todos los articulos");
        Articulo a2 = new Articulo("A102", "Pluma Azul", 934, 1.2);
        Articulo a3 = new Articulo("P103", "Lapiz del 12", 456, 0.5);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        int totalVenta = (int) a1.getTotal() + (int) a2.getTotal() + (int) a3.getTotal();
        System.out.println("Total venta: " + totalVenta);
    }
}
