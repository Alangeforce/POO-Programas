package p109_FormaV2;

public abstract class Forma {
    private String Color;
    private boolean Relleno;

    public Forma() {
    }

    public Forma(String color, boolean relleno) {
        Color = color;
        Relleno = relleno;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isRelleno() {
        return Relleno;
    }

    public void setRelleno(boolean relleno) {
        Relleno = relleno;
    }

    // Métodos abstractos: cada forma derivada está obligada a implementarlos
    public abstract double getArea();

    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Forma[Color=" + Color + ",Relleno=" + Relleno + "]";
    }
}
