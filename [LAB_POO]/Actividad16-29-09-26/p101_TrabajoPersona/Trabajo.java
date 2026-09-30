package p101_TrabajoPersona;

public class Trabajo {

    // Propiedades son privadas para darle encapsulamiento
    private int id;
    private String rol;
    private double Salario;

    public Trabajo() { // constructor vcio permite crear un obj sin valores para sus propiedades
    }

    public Trabajo(String rol, int id, double salario) { // constructor con parametros
        this.rol = rol;
        this.id = id;
        Salario = salario;
    }
    //  Los gets y los sets para cada una de las propiedades


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }


    @Override
    public String toString() {
        return "Trabajo{" +
                "id=" + id +
                ", rol='" + rol + '\'' +
                ", Salario=" + Salario +
                '}';
    }
}

