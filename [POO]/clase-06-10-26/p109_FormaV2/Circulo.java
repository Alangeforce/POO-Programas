package p109_FormaV2;

public class Circulo extends Forma {
    private double Radio;

    public Circulo() {
    }

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno); // Manda a llamar al constructor de la clase base
        Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Radio * Radio; // area = pi * r^2
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * Radio; // perimetro = 2 * pi * r
    }

    @Override
    public String toString() {
        return "Circulo[" + super.toString() + ",Radio=" + Radio + "]";
    }
}
