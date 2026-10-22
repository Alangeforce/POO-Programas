// Sedan hereda de Maquina e implementa el contrato Familiar
public class Sedan extends Maquina implements Familiar {

    public Sedan(String tipo, String nombre, String propietario, int pasajeros) {
        super(tipo, nombre, propietario, pasajeros);
    }

    @Override
    public void carroceriaTres() {
        System.out.println("Es un vehículo familiar con carrocería de tres volúmenes.");
    }

    @Override
    public void chasisMonocasco() {
        System.out.println("Es un vehículo familiar con chasis monocasco.");
    }
}
