import java.util.Scanner;

public class p076_DiaSemana {
    public static String DiaSemana(int dia) {
        switch(dia) {
            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return "Miercoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sabado";
            case 7: return "Domingo";
            default: return "Dia invalido";
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Dame un numero del 1 al 7 ? ");
        int dia = obj.nextInt();
        System.out.printf("\nEl dia de la semana es : %s\n", DiaSemana(dia));
        obj.close();
    }
}
