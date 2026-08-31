public class p040_Numeros100a1 {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");
        int num;

        num = 100;

        while( num >=1 ){
            System.out.print(num + "va en s");
            num--;            
        }
        System.out.println("\nProceso terminado...");
    }
}
