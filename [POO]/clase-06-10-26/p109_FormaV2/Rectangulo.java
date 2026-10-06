package p109_FormaV2;

public class Rectangulo extends Forma {
    private double Largo;
    private double Ancho;

    public Rectangulo() {
    }

    public Rectangulo(String color, boolean relleno, double largo, double ancho) {
        super(color, relleno); // Manda a llamar al constructor de la clase base
        Largo = largo;
        Ancho = ancho;
    }

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double largo) {
        Largo = largo;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double ancho) {
        Ancho = ancho;
    }

    @Override
    public double getArea() {
        return Largo * Ancho; // area = largo * ancho
    }

    @Override
    public double getPerimetro() {
        return 2 * (Largo + Ancho); // perimetro = 2 * (largo + ancho)
    }

    @Override
    public String toString() {
        return "Rectangulo[" + super.toString() + ",Largo=" + Largo + ",Ancho=" + Ancho + "]";
    }
}
