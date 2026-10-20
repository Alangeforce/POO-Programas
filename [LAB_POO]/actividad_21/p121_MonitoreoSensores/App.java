package p121_MonitoreoSensores;

public class App {
    public static void main(String[] args) {
        SensorTemperatura s1 = new SensorTemperatura(28.40, 18.00, 27.00);
        SensorTemperatura s2 = new SensorTemperatura(22.50, 18.00, 24.00);

        Medible m1 = s1;
        Medible m2 = s2;
        Alertable a1 = s1;
        Alertable a2 = s2;

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.printf("Sensor 1: %.2f %s | %s%n", m1.leerValor(), m1.getUnidad(),
                a1.estaEnAlerta() ? "ALERTA" : "NORMAL");
        System.out.printf("Sensor 2: %.2f %s | %s%n", m2.leerValor(), m2.getUnidad(),
                a2.estaEnAlerta() ? "ALERTA" : "NORMAL");
    }
}
