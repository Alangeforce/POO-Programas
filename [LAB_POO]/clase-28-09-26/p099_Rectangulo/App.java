package p099_Rectangulo;

public class App {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(1.2f, 3.4f);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println(r1);

        Rectangulo r2 = new Rectangulo();
        System.out.println(r2);

        r2.setLargo(5.6f);
        r2.setAncho(7.8f);
        System.out.println(r2);

        System.out.println("Longitud : " + r2.getLargo());
        System.out.println("Ancho " + r2.getAncho());
        System.out.println("area is: " + r2.getArea());
        System.out.printf("perimeter is: %.2f%n", r2.getPerimetro());
    }
}
