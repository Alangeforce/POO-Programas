// Trabaja con constantes
public class p018_TrabajandoConstantes {
    public static void main(String[] args) {
        final double PI = 3.141592653589793;
        final int DIAS_SEMANA = 7;
        final String NOMBRE = "Alan Alfonso Contreras Montalvo";
        final char SEXO = 'M';
        final boolean CASADO = false;
        System.out.print("\033[H\033[2J");
        System.out.println("El valor de PI              : " + PI);
        System.out.println("Los dias de la semana       : " + DIAS_SEMANA);
        System.out.println("Mi nombre                   : " + NOMBRE);
        System.out.println("Mi sexo                     : " + SEXO);
        System.out.println("Estoy casado                : " + CASADO);
        System.out.println("Area de un circulo de r=5   : " + PI * 5 * 5);
    }
}
