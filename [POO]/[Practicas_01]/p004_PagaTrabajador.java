// Calcula la paga de un trabajador segun las horas trabajadas y el pago por hora
import java.util.Scanner;
public class p004_PagaTrabajador {
public static void main(String[] args) {
System.out.print("\033[H\033[2J");
System.out.print("Dame las horas trabajadas: ");
double horas = new Scanner(System.in).nextDouble();
System.out.print("Dame el pago por hora: ");
double pago = new Scanner(System.in).nextDouble();
double paga = horas * pago;
System.out.printf("La paga del trabajador es: %.2f\n", paga);
}
}