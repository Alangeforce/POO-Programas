// Trabaja con la conversion de tipos de datos
public class p020_ConversionTipos {
    public static void main(String[] args) {
        int i = 100;
        long l = i;          // conversion implicita (int a long)
        float f = l;         // conversion implicita (long a float)
        double d = f;        // conversion implicita (float a double)
        System.out.print("\033[H\033[2J");
        System.out.println("Conversion implicita:");
        System.out.println("int    i = " + i);
        System.out.println("long   l = " + l);
        System.out.println("float  f = " + f);
        System.out.println("double d = " + d);

        double x = 100.5;
        int y = (int)x;      // conversion explicita (double a int, trunca)
        byte b = (byte)x;    // conversion explicita (double a byte)
        System.out.println("Conversion explicita:");
        System.out.println("double x = " + x);
        System.out.println("int    y = " + y);
        System.out.println("byte   b = " + b);

        int m = 300;
        byte n = (byte)m;    // desbordamiento por conversion explicita
        System.out.println("Desbordamiento: int m = " + m + " -> byte n = " + n);
    }
}
