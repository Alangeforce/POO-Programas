package p104_PuntoCirculo;

public class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(new Punto(5, 8), 6.0);
        Circulo c2 = new Circulo(new Punto(30, 46), 2.0);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Circulo 1 Area : " + c1.getArea());
        System.out.println("Circulo 1 Circunferencia : " + c1.getCircunferencia());
        System.out.println("Circulo 1 Centro : " + c1.getCentro());
        System.out.println("Distancia a Circulo 2 : " + c1.getCentro().getDistancia(c2.getCentro()));
    }
}
