import java.util.ArrayList;

public class p082_InicializaArregloCadenas {
    public static void main(String[] args) {
        ArrayList<String> municipios = new ArrayList<>();
        municipios.add("Apozol");
        municipios.add("Apulco");
        municipios.add("Cañitas");
        municipios.add("Jerez");
        municipios.add("Fresnillo");
        municipios.add("Río Grande");
        municipios.add("Saín Alto");
        municipios.add("Sombrerete");
        municipios.add("Teúl de González Ortega");
        municipios.add("Zacatecas");

        System.out.printf("Primer elemento de la lista: %s%n", municipios.get(0));
        System.out.printf("Ultimo elemento de la lista: %s%n", municipios.get(municipios.size() - 1));

        System.out.printf("%nTodos los elementos con ciclo for:%n");
        for (int i = 0; i < municipios.size(); i++) {
            System.out.printf("%s ", municipios.get(i));
        }

        System.out.printf("%n%nTodos los elementos con ciclo for-each:%n");
        for (String municipio : municipios) {
            System.out.printf("%s ", municipio);
        }
        System.out.println();
    }
}
