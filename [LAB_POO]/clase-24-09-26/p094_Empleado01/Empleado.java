package p094_Empleado01;

public class Empleado {
    private String Nombre;
    private int Edad;
    private char Sexo;
    private boolean Csa

    // constructor aqui de la clas, que rellena los valores de las propiedades


    public Empleado(String nombre, int edad) {
        Nombre = nombre;
        Edad = edad;

    }

    public Empleado() {
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Edad: %d", Nombre, Edad);
    }
}
