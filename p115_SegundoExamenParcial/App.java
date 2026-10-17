/**
 * =========================================================================================
 * PROYECTO PRACTICO: SEGUNDO EXAMEN PARCIAL (p115_SegundoExamenParcial)
 * SISTEMA DE CONTROL DE FLOTA DE VEHICULOS
 * 
 * Universidad Autonoma de Zacatecas (UAZ)
 * Unidad Academica de Ingenieria Electrica
 * Licenciatura en Ingenieria en Computacion / Software
 * Materia: Programacion Orientada a Objetos 1 y Laboratorio
 * Profesor: Carlos Hector Castañeda Ramirez
 * =========================================================================================
 * 
 * =========================================================================================
 * EXPLICACION TECNICA: POLIMORFISMO Y ENLACE DINAMICO (LATE BINDING)
 * =========================================================================================
 * 
 * ¿Como determina la Java Virtual Machine (JVM) que version del metodo getBonoConductor() ejecutar?
 * 
 * 1. Definicion de Enlace Estatico vs. Enlace Dinamico:
 *    - Enlace Estatico (Early Binding): Ocurre en tiempo de compilacion para metodos 'static',
 *      'private' o 'final'. El compilador asocia directamente la llamada con una direccion de
 *      memoria fija porque no existe posibilidad de sobreescritura (override).
 *    - Enlace Dinamico (Late Binding / Dynamic Method Dispatch): Mecanismo mediante el cual la
 *      asociacion entre la llamada a un metodo y su bloque de codigo ejecutable se posterga hasta
 *      el tiempo de ejecucion (runtime). En Java, todos los metodos de instancia que no sean 'final'
 *      o 'private' son virtuales por defecto.
 * 
 * 2. Rol del Compilador (Tiempo de Compilacion):
 *    Cuando el compilador de Java (javac) analiza las lineas de codigo en la clase Flota:
 *          for (Vehiculo vehiculo : vehiculos) {
 *              totalBono += vehiculo.getBonoConductor();
 *          }
 *    El compilador unicamente verifica el "tipo estatico" de la referencia, que es 'Vehiculo'.
 *    Comprueba que la clase 'Vehiculo' declare el metodo abstracto 'getBonoConductor()'. Al ser
 *    valido, javac emite en el bytecode la instruccion:
 *          invokevirtual #identificador_del_metodo
 *    El compilador NO decide ni conoce que clase concreta se ejecutara, solo garantiza la firma.
 * 
 * 3. Rol de la JVM en Tiempo de Ejecucion (Runtime):
 *    Cuando la JVM ejecuta la instruccion 'invokevirtual':
 *    a) Inspecciona el operando en el tope de la pila de ejecucion, que contiene la referencia al
 *       objeto receptor (la instancia real alojada en el Heap de memoria).
 *    b) Determina el "tipo dinamico" exacto del objeto instanciado (por ejemplo, si el objeto
 *       fue creado con 'new CamionCarga(...)' o 'new AutobusPasajeros(...)').
 *    c) Consulta la tabla de metodos virtuales de esa clase concreta (conocida en la JVM como
 *       'vtable' o 'Virtual Method Table'). En esta tabla, la entrada para 'getBonoConductor()'
 *       apunta directamente al puntero de la funcion sobreescrita (@Override) en CamionCarga
 *       o AutobusPasajeros.
 *    d) Se transfiere el control y se ejecuta el algoritmo de bono correspondiente a ese tipo
 *       concreto:
 *          - Si es CamionCarga: (CostoBase * 0.10) + (Ejes * 50) + (Kilometraje * 0.5)
 *          - Si es AutobusPasajeros: (CostoBase * 0.15) + (Rutas * 120) + (Pasajeros * 0.1)
 * 
 * 4. Beneficios en Ingenieria de Software:
 *    - Cumplimiento del Principio Abierto/Cerrado (OCP - Open/Closed Principle): La clase Flota
 *      queda completamente desacoplada de las clases hijas. Si manana la empresa anade
 *      'VehiculoElectrico' o 'AvionCarga', no es necesario modificar ni una sola linea del
 *      metodo getTotalBono() o reporte().
 *    - Eliminacion de codigo fragil: Se evita por completo el uso de condicionales en cascada
 *      'instanceof' o 'switch-case' por tipo de vehiculo, reduciendo la complejidad ciclomatica
 *      y garantizando un mantenimiento limpio y escalable.
 * =========================================================================================
 */
public class App {
    public static void main(String[] args) {
        // 1. Instanciacion de la Flota sin vehiculos registrados
        Flota flota = new Flota("División Norte", "Monterrey");

        // 2. Emision del Reporte Inicial de la flota vacia
        System.out.println("--- Reporte Inicial ---");
        System.out.println(flota);
        System.out.println();

        // 3. Insercion de datos de prueba (Camiones de Carga y Autobuses de Pasajeros)
        flota.agregarVehiculo(new CamionCarga("Volvo", "FMX", 30000, 2500.00, 4, 5000.0));
        flota.agregarVehiculo(new CamionCarga("Kenworth", "T680", 25000, 1800.00, 3, 4200.0));
        flota.agregarVehiculo(new AutobusPasajeros("Mercedes", "O500", 50, 1200.00, 5, 8500));
        flota.agregarVehiculo(new AutobusPasajeros("Irizar", "i6", 40, 1500.00, 8, 12000));
        flota.agregarVehiculo(new AutobusPasajeros("Scania", "K360", 45, 950.00, 4, 6200));

        // 4. Emision del Reporte Final detallado y resumen de totales
        System.out.println("--- Reporte Final con Datos de Prueba ---");
        flota.reporte();
        System.out.println(flota);
    }
}
