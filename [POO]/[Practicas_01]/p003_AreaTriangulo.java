// Calcula el area de un triangulo dada la base y la altura
import java.util.Scanner;
public class p003_AreaTriangulo {
public static void main(String[] args) {
System.out.print("\033[H\033[2J");
System.out.print("Dame la base del triangulo: ");
double base = new Scanner(System.in).nextDouble();
System.out.print("Dame la altura del triangulo: ");
double altura = new Scanner(System.in).nextDouble();
double area = (base * altura) / 2;
System.out.printf("El area del triangulo con base %.2f y altura %.2f es: %.2f\n", base, altura, area);
}
}