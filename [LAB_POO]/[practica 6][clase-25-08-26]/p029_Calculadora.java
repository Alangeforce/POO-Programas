
import java.util.Scanner;

public class p029_Calculadora{
    public static void main(String[] args) {
        int n1=0, n2=0;
        char op;
        Scanner obj = new Scanner(System.in);
        System.out.print("\u001b[H\u001b[2J");

        System.out.println("Calculadora Basica");

        System.out.print("Dame el primer numero: "); n1 =obj.nextInt();
        System.out.print("Dame el segundo numero: "); n2 =obj.nextInt();
        System.out.print("Que operador: + - * / ^: "); op =obj.next().charAt(0);

        
        

    }

}