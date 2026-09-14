import java.util.Scanner;

public class p079_Angulo {
    public static String TipoAngulo(double angulo) {
        if (angulo < 90) return "Agudo";
        else if (angulo == 90) return "Recto";
        else if (angulo > 90 && angulo < 180) return "Obtuso";
        else if (angulo == 180) return "Llano";
        else if (angulo > 180 && angulo < 360) return "Concavo";
        else return "Invalido";
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Dame un angulo entre 0 y 360 grados ? ");
        double angulo = obj.nextDouble();
        System.out.printf("\nEl angulo es del tipo : %s\n", TipoAngulo(angulo));
        obj.close();
    }
}
