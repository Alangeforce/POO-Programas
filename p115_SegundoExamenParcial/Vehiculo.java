import java.util.Locale;

/**
 * Clase Abstracta Base: Vehiculo
 * Representa los atributos y comportamientos comunes de cualquier vehiculo dentro de la flota.
 * 
 * Asignatura: Programacion Orientada a Objetos 1 y Laboratorio
 * Evaluacion: Segundo Examen Parcial (p115_SegundoExamenParcial)
 */
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int capacidad;
    private double costoBase;
    private double costoTotal;

    /**
     * Constructor de la clase base Vehiculo.
     * 
     * @param marca Marca del vehiculo (ej: Volvo, Irizar)
     * @param modelo Modelo especifico (ej: FMX, i6)
     * @param capacidad Capacidad de carga en kg o numero de pasajeros
     * @param costoBase Costo base de operacion mensual
     */
    public Vehiculo(String marca, String modelo, int capacidad, double costoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.costoBase = costoBase;
        this.costoTotal = 0.0;
    }

    // --- Metodos Getters y Setters ---

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    /**
     * Metodo abstracto para calcular el bono de desempeno especifico del conductor.
     * Cada subclase derivada implementara su propia formula de calculo polimorfica.
     * 
     * @return monto del bono calculado
     */
    public abstract double getBonoConductor();

    /**
     * Sobreescritura del metodo toString para mostrar los datos base del vehiculo.
     * Formatea el costoBase a 2 decimales para garantizar coincidencia con las especificaciones.
     * 
     * @return representacion textual de los datos basicos del vehiculo
     */
    @Override
    public String toString() {
        return "Vehiculo [Marca=" + marca + ", Modelo=" + modelo + ", Capacidad=" + capacidad + 
               ", CostoBase=" + String.format(Locale.US, "%.2f", costoBase) + "]";
    }
}
