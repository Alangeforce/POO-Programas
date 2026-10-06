package p109_FormaV2;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        // Arreglo de formas: no se puede instanciar Forma por ser abstracta
        Forma[] formas = new Forma[4];
        formas[0] = new Circulo("Rojo", true, 10.23);
        formas[1] = new Circulo("Verde", false, 99.12);
        formas[2] = new Rectangulo("Amarillo", false, 10.0, 20.0);
        formas[3] = new Rectangulo("Azul", true, 15.0, 44.0);

        System.out.println("Todas las formas:");
        for (Forma forma : formas) {
            System.out.println(forma);
        }

        System.out.println("Calculando áreas y perímetros de las figuras:");
        for (Forma forma : formas) {
            System.out.println("La forma es un " + (forma instanceof Circulo ? "Círculo" : "Rectángulo"));
            System.out.println("El área es: " + forma.getArea());
            System.out.println("El perímetro es: " + forma.getPerimetro());
        }
    }
}
