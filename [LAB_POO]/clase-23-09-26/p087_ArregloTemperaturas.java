// Calcula mayor, promedio y busqueda en una lista de temperaturas
import java.util.ArrayList;
import java.util.List;

public class p087_ArregloTemperaturas {

    static void Mostrar(ArrayList<Double> t) {
        for (double v : t) System.out.print(v + " ");
        System.out.println();
    }

    static double Mayor(ArrayList<Double> t) {
        double mayor = t.get(0);
        for (int i = 1; i < t.size(); i++)
            if (t.get(i) > mayor) mayor = t.get(i);
        return mayor;
    }

    static double Promedio(ArrayList<Double> t) {
        double suma = 0;
        for (double v : t) suma += v;
        return suma / t.size();
    }

    static int Buscar(ArrayList<Double> t, double b) {
        for (int i = 0; i < t.size(); i++)
            if (t.get(i) == b) return i;
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Double> temps = new ArrayList<>(List.of(12.34, 56.22, 56.78, 0.0, 10.25, 60.22));
        double temp = 10.25;
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nLas temperaturas son:");
        Mostrar(temps);
        System.out.printf("\nLa mayor es: %.2f", Mayor(temps));
        System.out.printf("\nEl promedio es: %.2f", Promedio(temps));
        int pos = Buscar(temps, temp);
        if (pos != -1)
            System.out.printf("\n%.2f esta en la posicion %d", temp, pos);
        else
            System.out.println("\nEl elemento no existe");
    }
}