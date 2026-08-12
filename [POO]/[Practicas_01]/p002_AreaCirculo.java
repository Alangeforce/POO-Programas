// Calcula el area de un circulo dado su radio
import java.util.Scanner;
public class p002_AreaCirculo {
public static void main(String[] args) {
System.out.print("\033[H\033[2J");
System.out.print("Dame el radio del circulo: ");
double radio = new Scanner(System.in).nextDouble();
double area = Math.PI * radio * radio;
System.out.printf("El area del circulo con radio %.2f es: %.2f\n", radio, area);
}
}