import java.util.ArrayList;

public class p081_InicializaArregloNumeros {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(5.0);
        numeros.add(10.0);
        numeros.add(15.5);
        numeros.add(20.5);
        numeros.add(25.0);
        numeros.add(100.22);
        numeros.add(90.0);

        System.out.printf("Primer elemento de la lista: %.2f%n", numeros.get(0));
        System.out.printf("Ultimo elemento de la lista: %.2f%n", numeros.get(numeros.size() - 1));

        System.out.printf("%nTodos los elementos con ciclo for:%n");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.printf("%.2f ", numeros.get(i));
        }

        System.out.printf("%n%nTodos los elementos con ciclo for-each:%n");
        for (double numero : numeros) {
            System.out.printf("%.2f ", numero);
        }
        System.out.println();
    }
}
