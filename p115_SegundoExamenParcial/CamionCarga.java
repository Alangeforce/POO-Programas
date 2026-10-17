/**
 * Clase: CamionCarga
 * Representa un vehiculo de carga pesada que extiende de la clase base abstracta Vehiculo.
 * Incorpora atributos especializados como el numero de ejes y kilometraje mensual.
 * 
 * Asignatura: Programacion Orientada a Objetos 1 y Laboratorio
 * Evaluacion: Segundo Examen Parcial (p115_SegundoExamenParcial)
 */
public class CamionCarga extends Vehiculo {
    private int ejes;
    private double kilometraje;

    /**
     * Constructor para la clase CamionCarga.
     * Invoca al constructor de la superclase Vehiculo mediante super(), asigna los atributos propios
     * y calcula el CostoTotal operativo (CostoBase + BonoConductor).
     * 
     * @param marca Marca del camion
     * @param modelo Modelo del camion
     * @param capacidad Capacidad de carga en kilogramos
     * @param costoBase Costo base mensual de operacion
     * @param ejes Numero de ejes del camion
     * @param kilometraje Kilometros recorridos durante el mes
     */
    public CamionCarga(String marca, String modelo, int capacidad, double costoBase, int ejes, double kilometraje) {
        super(marca, modelo, capacidad, costoBase);
        this.ejes = ejes;
        this.kilometraje = kilometraje;
        // Calculo del costo total operativo invocando el metodo polimorfico getBonoConductor()
        setCostoTotal(getCostoBase() + getBonoConductor());
    }

    // --- Metodos Getters y Setters ---

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    /**
     * Implementacion polimorfica del calculo del bono de conductor para camion de carga.
     * Formula: Bono = (CostoBase * 0.10) + (Ejes * 50) + (Kilometraje * 0.5)
     * 
     * @return monto del bono para el conductor del camion de carga
     */
    @Override
    public double getBonoConductor() {
        return (getCostoBase() * 0.10) + (ejes * 50) + (kilometraje * 0.5);
    }

    /**
     * Sobreescritura del metodo toString que reutiliza super.toString() para los datos base
     * e incorpora los atributos y resultados especificos del camion de carga.
     * 
     * @return representacion textual completa del camion de carga
     */
    @Override
    public String toString() {
        return "CamionCarga [" + super.toString() + ", Ejes=" + ejes + ", Kilometraje=" + kilometraje + 
               ", Bono=" + getBonoConductor() + ", CostoTotal=" + getCostoTotal() + "]";
    }
}
