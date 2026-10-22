// Clase base que concentra los datos y comportamientos compartidos de una maquina
public abstract class Maquina implements Vehiculo {
    protected String tipo;
    protected String nombre;
    protected String propietario;
    protected int pasajeros;

    public Maquina(String tipo, String nombre, String propietario, int pasajeros) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el vehículo ...");
    }

    @Override
    public void desplazarse() {
        System.out.println("Desplazándose ...");
    }

    public void repostar() {
        System.out.println("Repostando ...");
    }

    public void arrancar() {
        System.out.println("Arrancando ...");
    }

    public void frenar() {
        System.out.println("Frenando ...");
    }

    @Override
    public String toString() {
        return String.format("Máquina [Tipo=%s, Nombre=%s, Propietario=%s, Pasajeros=%d]",
                tipo, nombre, propietario, pasajeros);
    }
}
