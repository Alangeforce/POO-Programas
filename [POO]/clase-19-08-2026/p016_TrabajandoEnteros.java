// Trabaja con valores de tipo entero
public class p016_TrabajandoEnteros {
    public static void main(String[] args) {
        int num1 = 42;
        int num2 = 0x2A;
        int num3 = 052;
        int num4 = 0b101010;
        char ch1 = 'A';
        char ch2 = 65;
        System.out.print("\033[H\033[2J");
        System.out.println("Valor entero decimal      : " + num1);
        System.out.println("Valor entero hexadecimal  : " + num2);
        System.out.println("Valor entero octal        : " + num3);
        System.out.println("Valor entero binario      : " + num4);
        System.out.println("El valor del caracter ch1 : " + ch1);
        System.out.println("El valor del caracter ch2 : " + ch2);
        System.out.println("El valor del caracter ch2 como numero: " + (int)ch2);
    }
}
