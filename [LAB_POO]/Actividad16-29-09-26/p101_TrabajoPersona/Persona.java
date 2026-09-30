package p101_TrabajoPersona;

public class Persona {
    private String Nombre;
    private Trabajo Trabajo; // usamos como tipo de dato una clave existente


    // Constructores en fai, Primero el vacio
    public Persona() {
    }

    public Persona(String nombre, Trabajo trabajo) {
        Nombre = nombre;
        Trabajo = trabajo;
    }

    // Los getters y los setters

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Trabajo getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(Trabajo trabajo) {
        Trabajo = trabajo;
    }

    // Metodos personalizados

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", Trabajo=" + Trabajo +
                '}';
    }
}
