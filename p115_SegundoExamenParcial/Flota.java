import java.util.ArrayList;
import java.util.List;

/**
 * Clase: Flota
 * Administra la coleccion polimorfica de vehiculos de la empresa de transporte.
 * Permite agregar vehiculos, calcular totales consolidados de bonos y costos operativos,
 * y emitir reportes formateados en consola.
 * 
 * Asignatura: Programacion Orientada a Objetos 1 y Laboratorio
 * Evaluacion: Segundo Examen Parcial (p115_SegundoExamenParcial)
 */
public class Flota {
    private String nombre;
    private String ciudad;
    private List<Vehiculo> vehiculos;

    /**
     * Constructor de la clase Flota.
     * Inicializa los datos generales de la division y reserva memoria para la lista de vehiculos.
     * 
     * @param nombre Nombre descriptivo de la division o flota
     * @param ciudad Ciudad base de operaciones
     */
    public Flota(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.vehiculos = new ArrayList<>();
    }

    // --- Metodos Getters y Setters ---

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Agrega un vehiculo a la coleccion polimorfica de la flota.
     * 
     * @param vehiculo Instancia de cualquier clase derivada de Vehiculo
     */
    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    /**
     * Calcula la suma total de los bonos otorgados a los conductores de todos los vehiculos.
     * Aplica polimorfismo puro delegando el calculo mediante getBonoConductor() sin condicionales de tipo.
     * 
     * @return sumatoria de bonos de los conductores
     */
    public double getTotalBono() {
        double totalBono = 0.0;
        for (Vehiculo vehiculo : vehiculos) {
            totalBono += vehiculo.getBonoConductor();
        }
        return totalBono;
    }

    /**
     * Calcula la suma total de los costos operativos mensuales de todos los vehiculos.
     * Aplica polimorfismo puro sumando getCostoTotal() de cada vehiculo en la coleccion.
     * 
     * @return sumatoria de costos totales operativos
     */
    public double getTotalCosto() {
        double totalCosto = 0.0;
        for (Vehiculo vehiculo : vehiculos) {
            totalCosto += vehiculo.getCostoTotal();
        }
        return totalCosto;
    }

    /**
     * Cuantifica el total de camiones de carga registrados en la flota.
     * 
     * @return cantidad de vehiculos de tipo CamionCarga
     */
    public int getNumCamiones() {
        int camiones = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof CamionCarga) {
                camiones++;
            }
        }
        return camiones;
    }

    /**
     * Cuantifica el total de autobuses de pasajeros registrados en la flota.
     * 
     * @return cantidad de vehiculos de tipo AutobusPasajeros
     */
    public int getNumAutobuses() {
        int autobuses = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof AutobusPasajeros) {
                autobuses++;
            }
        }
        return autobuses;
    }

    /**
     * Imprime en consola el reporte detallado con la informacion de cada vehiculo registrado.
     * Utiliza un bucle for-each que aprovecha la resolucion polimorfica del metodo toString().
     */
    public void reporte() {
        System.out.println(">> Reporte Detallado de la Flota <<");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    /**
     * Sobreescritura del metodo toString para mostrar el resumen consolidado de la flota.
     * 
     * @return representacion textual resumida de la flota y sus metricas totales
     */
    @Override
    public String toString() {
        return "Flota [Nombre=" + nombre + ", Ciudad=" + ciudad + ", Vehículos=" + vehiculos.size() + 
               ", BonoTotal=" + getTotalBono() + ", CostoTotal=" + getTotalCosto() + 
               ", Camiones=" + getNumCamiones() + ", Autobuses=" + getNumAutobuses() + "]";
    }
}
