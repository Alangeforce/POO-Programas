// Trabaja con valores de tipo flotante
public class p017_TrabajandoFlotantes {
    public static void main(String[] args) {
        float num1 = 123.456f;
        double num2 = 12345.6789;
        double num3 = 1.2345e2;
        double num4 = 123.456e-2;
        System.out.print("\033[H\033[2J");
        System.out.println("Valor flotante                    : " + num1);
        System.out.println("Valor doble                       : " + num2);
        System.out.println("Valor doble en notacion cientifica: " + num3);
        System.out.println("Valor doble en notacion cientifica: " + num4);
        System.out.println("Suma de flotantes                 : " + (num1 + num2));
        System.out.println("Division de enteros cast a double : " + (double)(10/3));
        System.out.println("Division double                   : " + (10.0/3.0));
    }
}
