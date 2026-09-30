package p105_PuntoTriangulo;

public class Punto {
    private int X;
    private int Y;

    public Punto() {
    }

    public Punto(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public double getDistancia(Punto p) {
        return Math.sqrt(Math.pow(p.getX() - X, 2) + Math.pow(p.getY() - Y, 2));
    }

    @Override
    public String toString() {
        return "Punto [X=" + X + ", Y=" + Y + "]";
    }
}
