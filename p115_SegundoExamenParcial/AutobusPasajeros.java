/**
 * Clase: AutobusPasajeros
 * Representa un vehiculo de transporte colectivo de pasajeros que extiende de la clase base Vehiculo.
 * Incorpora atributos especializados como el numero de rutas atendidas y los pasajeros transportados.
 * 
 * Asignatura: Programacion Orientada a Objetos 1 y Laboratorio
 * Evaluacion: Segundo Examen Parcial (p115_SegundoExamenParcial)
 */
public class AutobusPasajeros extends Vehiculo {
    private int rutas;
    private int pasajerosTransportados;

    /**
     * Constructor para la clase AutobusPasajeros.
     * Invoca al constructor de la superclase Vehiculo mediante super(), asigna los atributos propios
     * y calcula el CostoTotal operativo (CostoBase + BonoConductor).
     * 
     * @param marca Marca del autobus
     * @param modelo Modelo del autobus
     * @param capacidad Capacidad maxima de pasajeros sentados
     * @param costoBase Costo base mensual de operacion
     * @param rutas Numero de rutas diferentes atendidas en el mes
     * @param pasajerosTransportados Total de pasajeros movilizados en el mes
     */
    public AutobusPasajeros(String marca, String modelo, int capacidad, double costoBase, int rutas, int pasajerosTransportados) {
        super(marca, modelo, capacidad, costoBase);
        this.rutas = rutas;
        this.pasajerosTransportados = pasajerosTransportados;
        // Calculo del costo total operativo invocando el metodo polimorfico getBonoConductor()
        setCostoTotal(getCostoBase() + getBonoConductor());
    }

    // --- Metodos Getters y Setters ---

    public int getRutas() {
        return rutas;
    }

    public void setRutas(int rutas) {
        this.rutas = rutas;
    }

    public int getPasajerosTransportados() {
        return pasajerosTransportados;
    }

    public void setPasajerosTransportados(int pasajerosTransportados) {
        this.pasajerosTransportados = pasajerosTransportados;
    }

    /**
     * Implementacion polimorfica del calculo del bono de conductor para autobus de pasajeros.
     * Formula: Bono = (CostoBase * 0.15) + (Rutas * 120) + (PasajerosTransportados * 0.1)
     * 
     * @return monto del bono para el conductor del autobus
     */
    @Override
    public double getBonoConductor() {
        return (getCostoBase() * 0.15) + (rutas * 120) + (pasajerosTransportados * 0.1);
    }

    /**
     * Sobreescritura del metodo toString que reutiliza super.toString() para los datos base
     * e incorpora los atributos y resultados especificos del autobus de pasajeros.
     * 
     * @return representacion textual completa del autobus de pasajeros
     */
    @Override
    public String toString() {
        return "AutobusPasajeros [" + super.toString() + ", Rutas=" + rutas + 
               ", PasajerosTransportados=" + pasajerosTransportados + 
               ", Bono=" + getBonoConductor() + ", CostoTotal=" + getCostoTotal() + "]";
    }
}
