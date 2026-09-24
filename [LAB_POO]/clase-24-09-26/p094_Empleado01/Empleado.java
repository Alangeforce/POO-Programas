package p094_Empleado01;

public class Empleado {
    private String Nombre;
    private int Edad;
    private char Sexo;
    private boolean Cadado;
    

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

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char sexo) {
        Sexo = sexo;
    }

    public boolean isCadado() {
        return Cadado;
    }

    public void setCadado(boolean cadado) {
        Cadado = cadado;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Edad: %d, Sexo: %c, Casado: %b", Nombre, Edad, Sexo, Cadado);
    }
}
