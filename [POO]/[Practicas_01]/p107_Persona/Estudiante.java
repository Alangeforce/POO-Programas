package p107_Persona;

public class Estudiante {
    private Persona Persona;
    private String Carrera;
    private int Año;
    private double Colegiatura;

    public Estudiante() {
    }

    public Estudiante(Persona persona, String carrera, int año, double colegiatura) {
        Persona = persona;
        Carrera = carrera;
        Año = año;
        Colegiatura = colegiatura;
    }

    public Persona getPersona() {
        return Persona;
    }

    public void setPersona(Persona persona) {
        Persona = persona;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        Año = año;
    }

    public double getColegiatura() {
        return Colegiatura;
    }

    public void setColegiatura(double colegiatura) {
        Colegiatura = colegiatura;
    }

    @Override
    public String toString() {
        return "Estudiante [Persona=" + Persona + ", Carrera=" + Carrera + ", Año=" + Año + ", Colegiatura=" + Colegiatura + "]";
    }
}
