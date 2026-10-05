package p107_Persona;

public class Apoyo {
    private Persona Persona;
    private String Escolaridad;
    private double Paga;

    public Apoyo() {
    }

    public Apoyo(Persona persona, String escolaridad, double paga) {
        Persona = persona;
        Escolaridad = escolaridad;
        Paga = paga;
    }

    public Persona getPersona() {
        return Persona;
    }

    public void setPersona(Persona persona) {
        Persona = persona;
    }

    public String getEscolaridad() {
        return Escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        Escolaridad = escolaridad;
    }

    public double getPaga() {
        return Paga;
    }

    public void setPaga(double paga) {
        Paga = paga;
    }

    @Override
    public String toString() {
        return "Apoyo [Persona=" + Persona + ", Escolaridad=" + Escolaridad + ", Paga=" + Paga + "]";
    }
}
