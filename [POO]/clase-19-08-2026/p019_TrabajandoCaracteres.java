// Trabaja con valores de tipo caracter
public class p019_TrabajandoCaracteres {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 66;
        char ch3 = '\u0043';
        char ch4 = 'd';
        System.out.print("\033[H\033[2J");
        System.out.println("El caracter ch1                  : " + ch1);
        System.out.println("El caracter ch2                  : " + ch2);
        System.out.println("El caracter ch3                  : " + ch3);
        System.out.println("El caracter ch4                  : " + ch4);
        System.out.println("ch4 en mayuscula                 : " + Character.toUpperCase(ch4));
        System.out.println("El valor numerico de ch1         : " + (int)ch1);
        System.out.println("El valor numerico de ch2         : " + (int)ch2);
        System.out.println("Caracteres de la 'a' a la 'f'    : ");
        for (char c = 'a'; c <= 'f'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
