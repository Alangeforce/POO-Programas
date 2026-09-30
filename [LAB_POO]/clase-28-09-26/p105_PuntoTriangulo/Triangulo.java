package p105_PuntoTriangulo;

public class Triangulo {
    private Punto V1;
    private Punto V2;
    private Punto V3;

    public Triangulo() {
    }

    public Triangulo(Punto v1, Punto v2, Punto v3) {
        V1 = v1;
        V2 = v2;
        V3 = v3;
    }

    public Punto getV1() {
        return V1;
    }

    public void setV1(Punto v1) {
        V1 = v1;
    }

    public Punto getV2() {
        return V2;
    }

    public void setV2(Punto v2) {
        V2 = v2;
    }

    public Punto getV3() {
        return V3;
    }

    public void setV3(Punto v3) {
        V3 = v3;
    }

    public double getPerimetro() {
        return V1.getDistancia(V2) + V2.getDistancia(V3) + V3.getDistancia(V1);
    }

    public String getTipo() {
        double d12 = V1.getDistancia(V2);
        double d23 = V2.getDistancia(V3);
        double d31 = V3.getDistancia(V1);
        if (d12 == d23 && d12 == d31) {
            return "Equilatero";
        } else if (d12 == d23 || d12 == d31 || d31 == d23) {
            return "Isoseles";
        } else {
            return "Escaleno";
        }
    }

    @Override
    public String toString() {
        return "Triangulo [V1=" + V1 + ", V2=" + V2 + ", V3=" + V3 + "]";
    }
}
