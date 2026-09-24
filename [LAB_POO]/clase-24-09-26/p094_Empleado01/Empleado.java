package p094_Empleado01;

public class Empleado {
    private String Nombre;
    private int Edad;
    private char Sexo;
    private boolean Casado;
    

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

    public boolean isCasado() {
        return Casado;
    }

    public void setCasado(boolean casado) {
        Casado = casado;
    }

    @Override
    public String toString() {
        String sexoTexto;
        if (Sexo == 'H' || Sexo == 'h') {
            sexoTexto = "Hombre";
        } else if (Sexo == 'M' || Sexo == 'm') {
            sexoTexto = "Mujer";
        } else {
            sexoTexto = "No especificado";
        }

        String estadoCivil = Casado ? "Casado" : "Soltero";
        return String.format("Nombre: %s, Edad: %d, Sexo: %s, Estado civil: %s", Nombre, Edad, sexoTexto, estadoCivil);
    }
}
