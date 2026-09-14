import java.util.Scanner;

public class p075_NumeroMenor {
    public static int NumeroMenor(int n1, int n2, int n3, int n4) {
        int menor = n1;
        if (n2 < menor) menor = n2;
        if (n3 < menor) menor = n3;
        if (n4 < menor) menor = n4;
        return menor;
    }
    public static void main(String[] args) {
        int n1, n2, n3, n4;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Dame cuatro numeros separados por espacio ? ");
        n1 = obj.nextInt(); n2 = obj.nextInt(); n3 = obj.nextInt(); n4 = obj.nextInt();
        System.out.printf("\nEl menor de los cuatro numeros es : %d\n", NumeroMenor(n1, n2, n3, n4));
        obj.close();
    }
}
